package f4.web.service.impl;

import f4.web.dao.TraceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f4.web.entity.Trace;
import f4.web.service.TraceService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("traceService")
@Transactional
public class TraceServiceImpl extends BaseServiceImpl<Trace,Integer> implements TraceService{

    @Autowired
    private TraceDao traceDao;

    @Override
    public List<Trace> getAllTraceWithStudent() {
        return traceDao.getAllTraceWithStudent();
    }
}
