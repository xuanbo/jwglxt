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

import f4.web.entity.Classroom;
import f4.web.service.ClassroomService;

@Controller
public class ClassroomController {

	@Autowired
    private ClassroomService classroomService;
	
	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/classrooms", method = RequestMethod.GET)
	public @ResponseBody List<Classroom> selectAll() {
		return classroomService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/classroom/{id}", method = RequestMethod.GET)
    public @ResponseBody Classroom selectById(@PathVariable Integer id) {
    	Classroom classroom = new Classroom();
    	classroom.setId(id);
        return classroomService.selectOne(classroom);
    }

    /**
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/classroom/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Classroom classroom = new Classroom();
        classroom.setId(id);
        modelMap.addAttribute("classroom", classroomService.selectOne(classroom));
        return "classinfo/classroominfo/classroominfo_update";
    }
    
    /**
     * 查询记录
     * 
     * @param classroom
     * @return
     */
    @RequestMapping(value = "/classroom", method = RequestMethod.GET)
    public @ResponseBody Classroom selectOne(@RequestBody Classroom classroom) {
    	return classroomService.selectOne(classroom);
    }

    /**
     * 添加
     *
     * @param classroom
     * @return
     */
    @RequestMapping(value = "/classroom", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Classroom classroom) {
        return classroomService.insert(classroom);
    }

    /**
     * 修改
     *
     * @param classroom
     * @return
     */
    @RequestMapping(value = "/classroom", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Classroom classroom) {
        return classroomService.update(classroom);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/classroom/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return classroomService.deleteById(id);
    }
}
