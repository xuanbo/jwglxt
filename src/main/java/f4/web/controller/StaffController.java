package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Staff;
import f4.web.service.StaffService;

@Controller
public class StaffController {

	@Autowired
    private StaffService staffService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/staff/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Staff> selectRoleById(@PathVariable Integer id) {
    	Staff staff = new Staff();
    	staff.setId(id);
        return staffService.select(staff);
    }
    
    /**
     * 添加
     *
     * @param staff
     * @return
     */
    @RequestMapping(value = "/staff", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Staff staff) {
        return staffService.insert(staff);
    }
    
    /**
     * 修改
     *
     * @param staff
     * @return
     */
    @RequestMapping(value = "/staff", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Staff staff) {
        return staffService.update(staff);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/staff/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return staffService.deleteById(id);
    }
}
