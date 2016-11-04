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

import f4.web.entity.Student;
import f4.web.service.StudentService;

@Controller
public class StudentController {

	@Autowired
    private StudentService studentService;

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public @ResponseBody List<Student> selectAll() {
		return studentService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public @ResponseBody Student selectById(@PathVariable Integer id) {
    	Student student = new Student();
    	student.setId(id);
        return studentService.selectOne(student);
    }

    /**
     * student
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/student/{id}/updatePage", method = RequestMethod.GET)
    public String updatePage(@PathVariable Integer id, ModelMap modelMap) {
        Student student = new Student();
        student.setId(id);
        modelMap.addAttribute("student", studentService.selectOne(student));
        return "student/student/student_update";
    }


    /**
     * student pool
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/student/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Student student = new Student();
        student.setId(id);
        modelMap.addAttribute("student", studentService.selectOne(student));
        return "recruitstudent/studentpool/studentpool_update";
    }
    
    /**
     * 查询记录
     * 
     * @param student
     * @return
     */
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public @ResponseBody Student selectOne(@RequestBody Student student) {
    	return studentService.selectOne(student);
    }

    /**
     * 添加
     *
     * @param student
     * @return
     */
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Student student) {
        return studentService.insert(student);
    }

    /**
     * 修改
     *
     * @param student
     * @return
     */
    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Student student) {
        return studentService.update(student);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return studentService.deleteById(id);
    }
}
