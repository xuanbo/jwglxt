package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/scores", method = RequestMethod.GET)
	public @ResponseBody List<Score> selectAll() {
		return scoreService.selectAll();
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
