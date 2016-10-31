package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Authority;
import f4.web.service.AuthorityService;
import org.springframework.transaction.annotation.Transactional;

@Service("authorityService")
@Transactional
public class AuthorityServiceImpl extends BaseServiceImpl<Authority, Integer> implements AuthorityService  {

}
