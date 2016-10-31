package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Template;
import f4.web.service.TemplateService;

@Controller
public class TemplateController {
	@Autowired
    private TemplateService templateService;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/template/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Template> selectRoleById(@PathVariable Integer id) {
    	Template template = new Template();
    	template.setId(id);
        return templateService.select(template);
    }
    
    /**
     * 添加
     * @param template
     * @return
     */
    @RequestMapping(value = "/template", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Template template) {
        return templateService.insert(template);
    }
    
    /**
     * 修改
     * @param template
     * @return
     */
    @RequestMapping(value = "/template", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Template template) {
        return templateService.update(template);
    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/template/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return templateService.deleteById(id);
    }
}
