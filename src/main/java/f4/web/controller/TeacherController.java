package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Teacher;
import f4.web.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
    private TeacherService teacherService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/teacher/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Teacher> selectRoleById(@PathVariable Integer id) {
    	Teacher teacher = new Teacher();
    	teacher.setId(id);
        return teacherService.select(teacher);
    }
    
    /**
     * 添加
     *
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Teacher teacher) {
        return teacherService.insert(teacher);
    }
    
    /**
     * 修改
     *
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Teacher teacher) {
        return teacherService.update(teacher);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/teacher/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return teacherService.deleteById(id);
    }
}
