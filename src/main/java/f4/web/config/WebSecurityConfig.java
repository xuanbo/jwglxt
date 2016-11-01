package f4.web.config;

import f4.web.security.MyUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Web Security
 *
 * Created by xuan on 16-11-1.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user").password("user").roles("user").and()
//                .withUser("admin").password("admin").roles("user", "admin");
        auth.userDetailsService(userDetailsService());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers(
                    "/assets/**",
                    "/bootstrap/**",
                    "/css/**",
                    "/fonts/**",
                    "/img/**",
                    "/js/**",
                    "/view/**",
                    "/favicon.ico",
                    "/login.html"
                ).permitAll().anyRequest().authenticated().and()
            .formLogin()
                .loginPage("/login.html")
                .usernameParameter("username")
                .passwordParameter("password")
                .failureForwardUrl("/login.html?error")
                .permitAll()
                .and()
            .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login.html?logout")
                .clearAuthentication(true)
                .invalidateHttpSession(true)
                .permitAll()
                .and()
            .exceptionHandling().accessDeniedPage("/403.html").and()
            .headers().frameOptions().disable();// 允许iframe嵌套
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new MyUserDetailsService();
    }
}
