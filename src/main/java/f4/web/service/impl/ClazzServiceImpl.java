package f4.web.service.impl;

import f4.web.dao.ClazzDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f4.web.entity.Clazz;
import f4.web.service.ClazzService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("clazzService")
@Transactional
public class ClazzServiceImpl extends BaseServiceImpl<Clazz,Integer> implements ClazzService {

    @Autowired
    private ClazzDao clazzDao;

    @Override
    public List<Clazz> getClazzAll() {
        return clazzDao.getClazzAll();
    }

    @Override
    public Clazz getClazzById(Integer id) {
        return clazzDao.getClazzById(id);
    }
}
