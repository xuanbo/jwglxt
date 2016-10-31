package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Dictionary;
import f4.web.service.DictionaryService;

@Controller
public class DictionaryController {

	@Autowired
    private DictionaryService dictionaryService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/dictionary/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Dictionary> selectRoleById(@PathVariable Integer id) {
    	Dictionary dictionary = new Dictionary();
    	dictionary.setId(id);
        return dictionaryService.select(dictionary);
    }
    
    /**
     * 添加
     *
     * @param dictionary
     * @return
     */
    @RequestMapping(value = "/dictionary", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Dictionary dictionary) {
        return dictionaryService.insert(dictionary);
    }
    
    /**
     * 修改
     *
     * @param dictionary
     * @return
     */
    @RequestMapping(value = "/dictionary", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Dictionary dictionary) {
        return dictionaryService.update(dictionary);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/dictionary/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return dictionaryService.deleteById(id);
    }
}
