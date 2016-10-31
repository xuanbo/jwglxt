package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Trace;
import f4.web.service.TraceService;
import org.springframework.transaction.annotation.Transactional;

@Service("traceService")
@Transactional
public class TraceServiceImpl extends BaseServiceImpl<Trace,Integer> implements TraceService{

}
