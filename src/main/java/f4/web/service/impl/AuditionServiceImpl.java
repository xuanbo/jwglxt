package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Audition;
import f4.web.service.AuditionService;
import org.springframework.transaction.annotation.Transactional;

@Service("auditionService")
@Transactional
public class AuditionServiceImpl extends BaseServiceImpl<Audition, Integer> implements AuditionService {

}
