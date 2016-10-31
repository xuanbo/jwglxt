package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Classroom;
import f4.web.service.ClassroomService;

@Controller
public class ClassroomController {
	@Autowired
    private ClassroomService classroomService;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/classroom/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Classroom> selectRoleById(@PathVariable Integer id) {
    	Classroom classroom = new Classroom();
    	classroom.setId(id);
        return classroomService.select(classroom);
    }
    
    /**
     * 添加
     * @param classroom
     * @return
     */
    @RequestMapping(value = "/classroom", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Classroom classroom) {
        return classroomService.insert(classroom);
    }
    
    /**
     * 修改
     * @param classroom
     * @return
     */
    @RequestMapping(value = "/classroom", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Classroom classroom) {
        return classroomService.update(classroom);
    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/classroom/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return classroomService.deleteById(id);
    }
}
