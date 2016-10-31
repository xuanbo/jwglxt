package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Subject;
import f4.web.service.SubjectService;

@Service("subjectService")
public class SubjectServiceImpl extends BaseServiceImpl<Subject,Integer> implements SubjectService {

}
