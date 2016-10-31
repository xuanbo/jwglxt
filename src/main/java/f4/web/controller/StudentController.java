package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Student> selectRoleById(@PathVariable Integer id) {
    	Student student = new Student();
    	student.setId(id);
        return studentService.select(student);
    }
    
    /**
     * 添加
     *
     * @param student
     * @return
     */
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Student student) {
        return studentService.insert(student);
    }
    
    /**
     * 修改
     *
     * @param student
     * @return
     */
    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Student student) {
        return studentService.update(student);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return studentService.deleteById(id);
    }
}
