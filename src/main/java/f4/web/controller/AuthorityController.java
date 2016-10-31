package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Authority;
import f4.web.service.AuthorityService;

@Controller
public class AuthorityController {
	@Autowired
    private AuthorityService authorityService;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/authority/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Authority> selectRoleById(@PathVariable Integer id) {
    	Authority authority = new Authority();
    	authority.setId(id);
        return authorityService.select(authority);
    }
    
    /**
     * 添加
     * @param authority
     * @return
     */
    @RequestMapping(value = "/authority", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Authority authority) {
        return authorityService.insert(authority);
    }
    
    /**
     * 修改
     * @param authority
     * @return
     */
    @RequestMapping(value = "/authority", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Authority authority) {
        return authorityService.update(authority);
    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/authority/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return authorityService.deleteById(id);
    }
}
