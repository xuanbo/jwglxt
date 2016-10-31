package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Schedule;
import f4.web.service.ScheduleService;
import org.springframework.transaction.annotation.Transactional;

@Service("scheduleService")
@Transactional
public class ScheduleServiceImpl extends BaseServiceImpl<Schedule,Integer> implements ScheduleService {

}
