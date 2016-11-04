package f4.web.service.impl;

import f4.web.dao.CommunicationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f4.web.entity.Communication;
import f4.web.service.CommunicationService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("communicationService")
@Transactional
public class CommunicationServiceImpl extends BaseServiceImpl<Communication,Integer> implements CommunicationService {

    @Autowired
    private CommunicationDao communicationDao;

    @Override
    public List<Communication> getAllCommunication() {
        return communicationDao.getAllCommunication();
    }
}
