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
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/staffs", method = RequestMethod.GET)
	public @ResponseBody List<Staff> selectAll() {
		return staffService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/staff/{id}", method = RequestMethod.GET)
    public @ResponseBody Staff selectById(@PathVariable Integer id) {
    	Staff staff = new Staff();
    	staff.setId(id);
        return staffService.selectOne(staff);
    }
    
    /**
     * 查询记录
     * 
     * @param staff
     * @return
     */
    @RequestMapping(value = "/staff", method = RequestMethod.GET)
    public @ResponseBody Staff selectOne(@RequestBody Staff staff) {
    	return staffService.selectOne(staff);
    }

    /**
     * 添加
     *
     * @param staff
     * @return
     */
    @RequestMapping(value = "/staff", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Staff staff) {
        return staffService.insert(staff);
    }

    /**
     * 修改
     *
     * @param staff
     * @return
     */
    @RequestMapping(value = "/staff", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Staff staff) {
        return staffService.update(staff);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/staff/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return staffService.deleteById(id);
    }
}
