package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Subject;
import f4.web.service.SubjectService;
import org.springframework.transaction.annotation.Transactional;

@Service("subjectService")
@Transactional
public class SubjectServiceImpl extends BaseServiceImpl<Subject,Integer> implements SubjectService {

}
