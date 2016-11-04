package f4.web.controller;

import java.util.List;

import f4.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Audition;
import f4.web.service.AuditionService;

@Controller
public class AuditionController {

	@Autowired
    private AuditionService auditionService;

    @Autowired
    private StudentService studentService;

	/**
	 * 查询所有记录
	 *
	 * @return
	 */
	@RequestMapping(value = "/auditions", method = RequestMethod.GET)
	public @ResponseBody List<Audition> selectAll() {
		return auditionService.getAllAuditionWithStudent();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/audition/{id}", method = RequestMethod.GET)
    public @ResponseBody Audition selectById(@PathVariable Integer id) {
    	Audition audition = new Audition();
    	audition.setId(id);
        return auditionService.selectOne(audition);
    }

    /**
     * add Page
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/audition/add", method = RequestMethod.GET)
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("students", studentService.selectAll());
        return "recruitstudent/auditioninfo/auditioninfo_add";
    }

    /**
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/audition/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Audition audition = new Audition();
        audition.setId(id);
        modelMap.addAttribute("students", studentService.selectAll());
        modelMap.addAttribute("audition", auditionService.selectOne(audition));
        return "recruitstudent/auditioninfo/auditioninfo_update";
    }

    /**
     * 查询记录
     *
     * @param audition
     * @return
     */
    @RequestMapping(value = "/audition", method = RequestMethod.GET)
    public @ResponseBody Audition selectOne(@RequestBody Audition audition) {
    	return auditionService.selectOne(audition);
    }

    /**
     * 添加
     *
     * @param audition
     * @return
     */
    @RequestMapping(value = "/audition", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Audition audition) {
        return auditionService.insert(audition);
    }

    /**
     * 修改
     *
     * @param audition
     * @return
     */
    @RequestMapping(value = "/audition", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Audition audition) {
        return auditionService.update(audition);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/audition/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return auditionService.deleteById(id);
    }
}
