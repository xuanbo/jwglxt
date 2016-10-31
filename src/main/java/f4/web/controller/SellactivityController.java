package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/sellactivity/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Sellactivity> selectRoleById(@PathVariable Integer id) {
    	Sellactivity sellactivity = new Sellactivity();
    	sellactivity.setId(id);
        return sellactivityService.select(sellactivity);
    }
    
    /**
     * 添加
     * @param sellactivity
     * @return
     */
    @RequestMapping(value = "/sellactivity", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Sellactivity sellactivity) {
        return sellactivityService.insert(sellactivity);
    }
    
    /**
     * 修改
     * @param sellactivity
     * @return
     */
    @RequestMapping(value = "/sellactivity", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Sellactivity sellactivity) {
        return sellactivityService.update(sellactivity);
    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/sellactivity/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return sellactivityService.deleteById(id);
    }
}
