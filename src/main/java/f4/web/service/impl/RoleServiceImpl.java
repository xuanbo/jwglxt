package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Role;
import f4.web.service.RoleService;
import org.springframework.transaction.annotation.Transactional;

@Service("roleService")
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer> implements RoleService {
	
}
