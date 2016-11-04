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

import f4.web.entity.Evaluate;
import f4.web.service.EvaluateService;

@Controller
public class EvaluateController {

	@Autowired
    private EvaluateService evaluateService;


	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/evaluates", method = RequestMethod.GET)
	public @ResponseBody List<Evaluate> selectAll() {
		return evaluateService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/evaluate/{id}", method = RequestMethod.GET)
    public @ResponseBody Evaluate selectById(@PathVariable Integer id) {
    	Evaluate evaluate = new Evaluate();
    	evaluate.setId(id);
        return evaluateService.selectOne(evaluate);
    }

    /**
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/evaluate/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Evaluate evaluate = new Evaluate();
        evaluate.setId(id);
        modelMap.addAttribute("evaluate", evaluateService.selectOne(evaluate));
        return "student/evaluationinfo/evaluationinfo_update";
    }
    
    /**
     * 查询记录
     * 
     * @param evaluate
     * @return
     */
    @RequestMapping(value = "/evaluate", method = RequestMethod.GET)
    public @ResponseBody Evaluate selectOne(@RequestBody Evaluate evaluate) {
    	return evaluateService.selectOne(evaluate);
    }

    /**
     * 添加
     *
     * @param evaluate
     * @return
     */
    @RequestMapping(value = "/evaluate", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Evaluate evaluate) {
        return evaluateService.insert(evaluate);
    }

    /**
     * 修改
     *
     * @param evaluate
     * @return
     */
    @RequestMapping(value = "/evaluate", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Evaluate evaluate) {
        return evaluateService.update(evaluate);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/evaluate/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return evaluateService.deleteById(id);
    }
}
