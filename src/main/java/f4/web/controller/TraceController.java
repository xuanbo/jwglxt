package f4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import f4.web.entity.Trace;
import f4.web.service.TraceService;

@Controller
public class TraceController {

	@Autowired
    private TraceService traceService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/trace/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Trace> selectRoleById(@PathVariable Integer id) {
    	Trace trace = new Trace();
    	trace.setId(id);
        return traceService.select(trace);
    }
    
    /**
     * 添加
     *
     * @param trace
     * @return
     */
    @RequestMapping(value = "/trace", method = RequestMethod.POST)
    public @ResponseBody int addRole(@RequestBody Trace trace) {
        return traceService.insert(trace);
    }
    
    /**
     * 修改
     *
     * @param trace
     * @return
     */
    @RequestMapping(value = "/trace", method = RequestMethod.PUT)
    public @ResponseBody int updateRoleById(@RequestBody Trace trace) {
        return traceService.update(trace);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/trace/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteRoleById(@PathVariable Integer id) {
        return traceService.deleteById(id);
    }
}
