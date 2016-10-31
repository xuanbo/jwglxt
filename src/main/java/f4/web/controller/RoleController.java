package f4.web.controller;

import f4.web.entity.Role;
import f4.web.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色
 * @author 12638
 *
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;


	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public @ResponseBody List<Role> selectAll() {
		return roleService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/role/{id}", method = RequestMethod.GET)
    public @ResponseBody Role selectById(@PathVariable Integer id) {
    	Role role = new Role();
    	role.setId(id);
        return roleService.selectOne(role);
    }
    
    /**
     * 查询记录
     * 
     * @param role
     * @return
     */
    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public @ResponseBody Role selectOne(@RequestBody Role role) {
    	return roleService.selectOne(role);
    }

    /**
     * 添加
     *
     * @param role
     * @return
     */
    @RequestMapping(value = "/role", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Role role) {
        return roleService.insert(role);
    }

    /**
     * 修改
     *
     * @param role
     * @return
     */
    @RequestMapping(value = "/role", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Role role) {
        return roleService.update(role);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/role/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return roleService.deleteById(id);
    }
}
