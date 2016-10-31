package f4.web.service.impl;


import org.springframework.stereotype.Service;

import f4.web.entity.Attendance;
import f4.web.service.AttendanceService;
import org.springframework.transaction.annotation.Transactional;

@Service("attendanceService")
@Transactional
public class AttendanceServiceImpl extends BaseServiceImpl<Attendance, Integer> implements AttendanceService {

}
