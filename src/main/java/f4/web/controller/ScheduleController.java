package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Schedule;
import f4.web.service.ScheduleService;

@Controller
public class ScheduleController {

	@Autowired
    private ScheduleService scheduleService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/schedule/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Schedule> selectRoleById(@PathVariable Integer id) {
    	Schedule schedule = new Schedule();
    	schedule.setId(id);
        return scheduleService.select(schedule);
    }
    
    /**
     * 添加
     *
     * @param schedule
     * @return
     */
    @RequestMapping(value = "/schedule", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Schedule schedule) {
        return scheduleService.insert(schedule);
    }
    
    /**
     * 修改
     *
     * @param schedule
     * @return
     */
    @RequestMapping(value = "/schedule", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Schedule schedule) {
        return scheduleService.update(schedule);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/schedule/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return scheduleService.deleteById(id);
    }
}
