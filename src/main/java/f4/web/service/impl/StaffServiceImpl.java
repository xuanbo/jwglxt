package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Staff;
import f4.web.service.StaffService;

@Service("staffService")
public class StaffServiceImpl extends BaseServiceImpl<Staff,Integer> implements StaffService{

}
