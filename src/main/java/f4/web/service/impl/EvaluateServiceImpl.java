package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Evaluate;
import f4.web.service.EvaluateService;
import org.springframework.transaction.annotation.Transactional;

@Service("evaluateService")
@Transactional
public class EvaluateServiceImpl extends BaseServiceImpl<Evaluate,Integer> implements EvaluateService {

}
