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

import f4.web.entity.Score;
import f4.web.service.ScoreService;

@Controller
public class ScoreController {

	@Autowired
    private ScoreService scoreService;

    @Autowired
    private StudentService studentService;

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/scores", method = RequestMethod.GET)
	public @ResponseBody List<Score> selectAll() {
		return scoreService.getAllScore();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/score/{id}", method = RequestMethod.GET)
    public @ResponseBody Score selectById(@PathVariable Integer id) {
    	Score score = new Score();
    	score.setId(id);
        return scoreService.selectOne(score);
    }

    /**
     * add Page
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/score/add", method = RequestMethod.GET)
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("students", studentService.selectAll());
        return "student/studentwritegrade/studentwritegrade_add";
    }

    /**
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/score/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Score score = new Score();
        score.setId(id);
        modelMap.addAttribute("score", scoreService.selectOne(score));
        modelMap.addAttribute("students", studentService.selectAll());
        return "student/studentwritegrade/studentwritegrade_update";
    }
    
    /**
     * 查询记录
     * 
     * @param score
     * @return
     */
    @RequestMapping(value = "/score", method = RequestMethod.GET)
    public @ResponseBody Score selectOne(@RequestBody Score score) {
    	return scoreService.selectOne(score);
    }

    /**
     * 添加
     *
     * @param score
     * @return
     */
    @RequestMapping(value = "/score", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Score score) {
        return scoreService.insert(score);
    }

    /**
     * 修改
     *
     * @param score
     * @return
     */
    @RequestMapping(value = "/score", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Score score) {
        return scoreService.update(score);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/score/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return scoreService.deleteById(id);
    }
}
