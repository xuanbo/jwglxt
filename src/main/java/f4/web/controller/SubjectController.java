package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Subject;
import f4.web.service.SubjectService;

@Controller
public class SubjectController {

	@Autowired
    private SubjectService subjectService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/subject/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Subject> selectRoleById(@PathVariable Integer id) {
    	Subject subject = new Subject();
    	subject.setId(id);
        return subjectService.select(subject);
    }
    
    /**
     * 添加
     *
     * @param subject
     * @return
     */
    @RequestMapping(value = "/subject", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Subject subject) {
        return subjectService.insert(subject);
    }
    
    /**
     * 修改
     * @param subject
     * @return
     */
    @RequestMapping(value = "/subject", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Subject subject) {
        return subjectService.update(subject);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/subject/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return subjectService.deleteById(id);
    }
}
