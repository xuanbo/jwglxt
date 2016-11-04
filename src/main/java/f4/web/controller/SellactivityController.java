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

import f4.web.entity.Sellactivity;
import f4.web.service.SellactivityService;

@Controller
public class SellactivityController {

	@Autowired
    private SellactivityService sellactivityService;


	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/sellactivitys", method = RequestMethod.GET)
	public @ResponseBody List<Sellactivity> selectAll() {
		return sellactivityService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/sellactivity/{id}", method = RequestMethod.GET)
    public @ResponseBody Sellactivity selectById(@PathVariable Integer id) {
    	Sellactivity sellactivity = new Sellactivity();
    	sellactivity.setId(id);
        return sellactivityService.selectOne(sellactivity);
    }

    /**
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/sellactivity/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Sellactivity sellactivity = new Sellactivity();
        sellactivity.setId(id);
        modelMap.addAttribute("sellactivity", sellactivityService.selectOne(sellactivity));
        return "marketactive/marketactive/marketactive_update";
    }
    
    /**
     * 查询记录
     * 
     * @param sellactivity
     * @return
     */
    @RequestMapping(value = "/sellactivity", method = RequestMethod.GET)
    public @ResponseBody Sellactivity selectOne(@RequestBody Sellactivity sellactivity) {
    	return sellactivityService.selectOne(sellactivity);
    }

    /**
     * 添加
     *
     * @param sellactivity
     * @return
     */
    @RequestMapping(value = "/sellactivity", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Sellactivity sellactivity) {
        return sellactivityService.insert(sellactivity);
    }

    /**
     * 修改
     *
     * @param sellactivity
     * @return
     */
    @RequestMapping(value = "/sellactivity", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Sellactivity sellactivity) {
        return sellactivityService.update(sellactivity);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/sellactivity/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return sellactivityService.deleteById(id);
    }
}
