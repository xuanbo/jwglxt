package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Evaluate;
import f4.web.service.EvaluateService;

@Controller
public class EvaluateController {
	@Autowired
    private EvaluateService evaluateService;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/evaluate/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Evaluate> selectRoleById(@PathVariable Integer id) {
    	Evaluate evaluate = new Evaluate();
    	evaluate.setId(id);
        return evaluateService.select(evaluate);
    }
    
    /**
     * 添加
     * @param evaluate
     * @return
     */
    @RequestMapping(value = "/evaluate", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Evaluate evaluate) {
        return evaluateService.insert(evaluate);
    }
    
    /**
     * 修改
     * @param evaluate
     * @return
     */
    @RequestMapping(value = "/evaluate", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Evaluate evaluate) {
        return evaluateService.update(evaluate);
    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/evaluate/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return evaluateService.deleteById(id);
    }
}
