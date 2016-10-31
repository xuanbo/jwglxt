package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Student;
import f4.web.service.StudentService;

@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<Student,Integer> implements StudentService {

}
