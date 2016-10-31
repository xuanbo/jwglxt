package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Trace;
import f4.web.service.TraceService;

@Service("traceService")
public class TraceServiceImpl extends BaseServiceImpl<Trace,Integer> implements TraceService{

}
