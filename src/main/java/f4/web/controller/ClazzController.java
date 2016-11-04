package f4.web.controller;

import java.util.List;

import f4.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Clazz;

@Controller
public class ClazzController {

	@Autowired
    private ClazzService clazzService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private ClassroomService classroomService;

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/clazzs", method = RequestMethod.GET)
	public @ResponseBody List<Clazz> selectAll() {
		return clazzService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/clazz/{id}", method = RequestMethod.GET)
    public @ResponseBody Clazz selectById(@PathVariable Integer id) {
    	Clazz clazz = new Clazz();
    	clazz.setId(id);
        return clazzService.selectOne(clazz);
    }

    /**
     * add Page
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/clazz/add", method = RequestMethod.GET)
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("teachers", teacherService.selectAll());
        modelMap.addAttribute("subjects", subjectService.selectAll());
        modelMap.addAttribute("schedules", scheduleService.selectAll());
        modelMap.addAttribute("classrooms", classroomService.selectAll());
        return "classinfo/classinfo/classinfo_add";
    }

    @RequestMapping(value = "/clazz/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Clazz clazz = new Clazz();
        clazz.setId(id);
        modelMap.addAttribute("clazz", clazzService.getClazzById(id));
        modelMap.addAttribute("teachers", teacherService.selectAll());
        modelMap.addAttribute("subjects", subjectService.selectAll());
        modelMap.addAttribute("schedules", scheduleService.selectAll());
        modelMap.addAttribute("classrooms", classroomService.selectAll());
        return "classinfo/classinfo/classinfo_update";
    }
    
    /**
     * 查询记录
     * 
     * @param clazz
     * @return
     */
    @RequestMapping(value = "/clazz", method = RequestMethod.GET)
    public @ResponseBody Clazz selectOne(@RequestBody Clazz clazz) {
    	return clazzService.selectOne(clazz);
    }

    /**
     * 添加
     *
     * @param clazz
     * @return
     */
    @RequestMapping(value = "/clazz", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Clazz clazz) {
        return clazzService.insert(clazz);
    }

    /**
     * 修改
     *
     * @param clazz
     * @return
     */
    @RequestMapping(value = "/clazz", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Clazz clazz) {
        return clazzService.update(clazz);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/clazz/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return clazzService.deleteById(id);
    }
}
