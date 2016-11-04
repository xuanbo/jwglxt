package f4.web.controller;

import java.util.List;

import f4.web.entity.Student;
import f4.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    @Autowired
    private StudentService studentService;
	
	/**
	 * 查询所有记录
     * 关联查询学生
	 * 
	 * @return
	 */
	@RequestMapping(value = "/traces", method = RequestMethod.GET)
	public @ResponseBody List<Trace> selectAll() {
		return traceService.getAllTraceWithStudent();
	}

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/trace/{id}", method = RequestMethod.GET)
    public @ResponseBody Trace selectById(@PathVariable Integer id) {
    	Trace trace = new Trace();
    	trace.setId(id);
        return traceService.selectOne(trace);
    }

    /**
     * add Page
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/trace/add", method = RequestMethod.GET)
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("students", studentService.selectAll());
        return "recruitstudent/trackrecord/trackrecord_add";
    }

    /**
     * update Page
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/trace/{id}/update", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Trace trace = new Trace();
        trace.setId(id);
        modelMap.addAttribute("trace", traceService.selectOne(trace));
        modelMap.addAttribute("students", studentService.selectAll());
        return "recruitstudent/trackrecord/trackrecord_update";
    }
    
    /**
     * 查询记录
     * 
     * @param trace
     * @return
     */
    @RequestMapping(value = "/trace", method = RequestMethod.GET)
    public @ResponseBody Trace selectOne(@RequestBody Trace trace) {
    	return traceService.selectOne(trace);
    }

    /**
     * 添加
     *
     * @param trace
     * @return
     */
    @RequestMapping(value = "/trace", method = RequestMethod.POST)
    public @ResponseBody int insert(@RequestBody Trace trace) {
        return traceService.insert(trace);
    }

    /**
     * 修改
     *
     * @param trace
     * @return
     */
    @RequestMapping(value = "/trace", method = RequestMethod.PUT)
    public @ResponseBody int update(@RequestBody Trace trace) {
        return traceService.update(trace);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/trace/{id}", method = RequestMethod.DELETE)
    public @ResponseBody int deleteById(@PathVariable Integer id) {
        return traceService.deleteById(id);
    }
}
