package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Schedule;
import f4.web.service.ScheduleService;

@Service("scheduleService")
public class ScheduleServiceImpl extends BaseServiceImpl<Schedule,Integer> implements ScheduleService {

}
