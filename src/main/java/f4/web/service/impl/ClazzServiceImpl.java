package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Clazz;
import f4.web.service.ClazzService;
import org.springframework.transaction.annotation.Transactional;

@Service("clazzService")
@Transactional
public class ClazzServiceImpl extends BaseServiceImpl<Clazz,Integer> implements ClazzService {

}
