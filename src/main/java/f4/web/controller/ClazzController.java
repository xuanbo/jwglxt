package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Clazz;
import f4.web.service.ClazzService;

@Controller
public class ClazzController {

	@Autowired
    private ClazzService clazzService;

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/clazzs", method = RequestMethod.GET)
	public @ResponseBody List<Clazz> selectAll() {
		return clazzService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/clazz/{id}", method = RequestMethod.GET)
    public @ResponseBody Clazz selectById(@PathVariable Integer id) {
    	Clazz clazz = new Clazz();
    	clazz.setId(id);
        return clazzService.selectOne(clazz);
    }
    
    /**
     * 查询记录
     * 
     * @param clazz
     * @return
     */
    @RequestMapping(value = "/clazz", method = RequestMethod.GET)
    public @ResponseBody Clazz selectOne(@RequestBody Clazz clazz) {
    	return clazzService.selectOne(clazz);
    }

    /**
     * 添加
     *
     * @param clazz
     * @return
     */
    @RequestMapping(value = "/clazz", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Clazz clazz) {
        return clazzService.insert(clazz);
    }

    /**
     * 修改
     *
     * @param clazz
     * @return
     */
    @RequestMapping(value = "/clazz", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Clazz clazz) {
        return clazzService.update(clazz);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/clazz/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return clazzService.deleteById(id);
    }
}
