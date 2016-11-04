package f4.web.service.impl;

import f4.web.dao.AuditionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f4.web.entity.Audition;
import f4.web.service.AuditionService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("auditionService")
@Transactional
public class AuditionServiceImpl extends BaseServiceImpl<Audition, Integer> implements AuditionService {

    @Autowired
    private AuditionDao auditionDao;

    @Override
    public List<Audition> getAllAuditionWithStudent() {
        return auditionDao.getAllAuditionWithStudent();
    }
}
