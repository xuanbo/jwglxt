package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Message;
import f4.web.service.MessageService;

@Service("messageService")
public class MessageServiceImpl extends BaseServiceImpl<Message,Integer> implements MessageService{

}
