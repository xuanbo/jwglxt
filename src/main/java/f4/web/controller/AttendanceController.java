package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Attendance;
import f4.web.service.AttendanceService;

@Controller
public class AttendanceController {

	@Autowired
    private AttendanceService attendanceService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/attendance/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Attendance> selectRoleById(@PathVariable Integer id) {
    	Attendance attendance = new Attendance();
    	attendance.setId(id);
        return attendanceService.select(attendance);
    }

    /**
     * 添加
     *
     * @param attendance
     * @return
     */
    @RequestMapping(value = "/attendance", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Attendance attendance) {
        return attendanceService.insert(attendance);
    }

    /**
     * 修改
     *
     * @param attendance
     * @return
     */
    @RequestMapping(value = "/attendance", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Attendance attendance) {
        return attendanceService.update(attendance);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/attendance/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return attendanceService.deleteById(id);
    }
}
