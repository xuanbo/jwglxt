package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Email;
import f4.web.service.EmailService;

@Service("emailService")
public class EmailServiceImpl extends BaseServiceImpl<Email,Integer> implements EmailService {

}
