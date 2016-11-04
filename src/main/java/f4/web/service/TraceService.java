package f4.web.service;

import f4.web.entity.Trace;

import java.util.List;

public interface TraceService extends BaseService<Trace, Integer>  {

    /**
     * 查询记录和学生记录
     *
     * @return
     */
    List<Trace> getAllTraceWithStudent();
}
