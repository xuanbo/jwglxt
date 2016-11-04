package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/teachers", method = RequestMethod.GET)
	public @ResponseBody List<Teacher> selectAll() {
		return teacherService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/teacher/{id}", method = RequestMethod.GET)
    public @ResponseBody Teacher selectById(@PathVariable Integer id) {
    	Teacher teacher = new Teacher();
    	teacher.setId(id);
        return teacherService.selectOne(teacher);
    }

    /**
     * show Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/teacher/{id}/show", method = RequestMethod.GET)
    public String show(@PathVariable Integer id, ModelMap modelMap) {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        modelMap.addAttribute("teacher", teacherService.selectOne(teacher));
        return "classinfo/teacher/teacher_show";
    }

    /**
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/teacher/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        modelMap.addAttribute("teacher", teacherService.selectOne(teacher));
        return "classinfo/teacher/teacher_update";
    }
    
    /**
     * 查询记录
     * 
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public @ResponseBody Teacher selectOne(@RequestBody Teacher teacher) {
    	return teacherService.selectOne(teacher);
    }

    /**
     * 添加
     *
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Teacher teacher) {
        return teacherService.insert(teacher);
    }

    /**
     * 修改
     *
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Teacher teacher) {
        return teacherService.update(teacher);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/teacher/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return teacherService.deleteById(id);
    }
}
