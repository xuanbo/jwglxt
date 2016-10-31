package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/audition/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Audition> selectRoleById(@PathVariable Integer id) {
    	Audition audition = new Audition();
    	audition.setId(id);
        return auditionService.select(audition);
    }
    
    /**
     * 添加
     *
     * @param audition
     * @return
     */
    @RequestMapping(value = "/audition", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Audition audition) {
        return auditionService.insert(audition);
    }
    
    /**
     * 修改
     *
     * @param audition
     * @return
     */
    @RequestMapping(value = "/audition", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Audition audition) {
        return auditionService.update(audition);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/audition/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return auditionService.deleteById(id);
    }
}
