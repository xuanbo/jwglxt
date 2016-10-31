package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Classroom;
import f4.web.service.ClassroomService;
import org.springframework.transaction.annotation.Transactional;

@Service("classroomService")
@Transactional
public class ClassroomServiceImpl extends BaseServiceImpl<Classroom,Integer> implements ClassroomService {

}
