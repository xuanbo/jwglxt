package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Message;
import f4.web.service.MessageService;
import org.springframework.transaction.annotation.Transactional;

@Service("messageService")
@Transactional
public class MessageServiceImpl extends BaseServiceImpl<Message,Integer> implements MessageService{

}
