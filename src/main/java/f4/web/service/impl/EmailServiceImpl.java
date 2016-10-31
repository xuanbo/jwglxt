package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Email;
import f4.web.service.EmailService;
import org.springframework.transaction.annotation.Transactional;

@Service("emailService")
@Transactional
public class EmailServiceImpl extends BaseServiceImpl<Email,Integer> implements EmailService {

}
