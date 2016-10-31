package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Communication;
import f4.web.service.CommunicationService;

@Controller
public class CommunicationController {

	@Autowired
    private CommunicationService communicationService;


	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/communications", method = RequestMethod.GET)
	public @ResponseBody List<Communication> selectAll() {
		return communicationService.selectAll();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/communication/{id}", method = RequestMethod.GET)
    public @ResponseBody Communication selectById(@PathVariable Integer id) {
    	Communication communication = new Communication();
    	communication.setId(id);
        return communicationService.selectOne(communication);
    }
    
    /**
     * 查询记录
     * 
     * @param communication
     * @return
     */
    @RequestMapping(value = "/communication", method = RequestMethod.GET)
    public @ResponseBody Communication selectOne(@RequestBody Communication communication) {
    	return communicationService.selectOne(communication);
    }

    /**
     * 添加
     *
     * @param communication
     * @return
     */
    @RequestMapping(value = "/communication", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Communication communication) {
        return communicationService.insert(communication);
    }

    /**
     * 修改
     *
     * @param communication
     * @return
     */
    @RequestMapping(value = "/communication", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Communication communication) {
        return communicationService.update(communication);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/communication/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return communicationService.deleteById(id);
    }
}
