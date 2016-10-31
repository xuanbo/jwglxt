package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Teacher;
import f4.web.service.TeacherService;
import org.springframework.transaction.annotation.Transactional;

@Service("teacherService")
@Transactional
public class TeacherServiceImpl extends BaseServiceImpl<Teacher,Integer> implements TeacherService {

}
