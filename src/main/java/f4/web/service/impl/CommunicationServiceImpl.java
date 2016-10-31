package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Communication;
import f4.web.service.CommunicationService;

@Service("communicationService")
public class CommunicationServiceImpl extends BaseServiceImpl<Communication,Integer> implements CommunicationService {

}
