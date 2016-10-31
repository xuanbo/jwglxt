package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Template;
import f4.web.service.TemplateService;
import org.springframework.transaction.annotation.Transactional;

@Service("templateService")
@Transactional
public class TemplateServiceImpl  extends BaseServiceImpl<Template,Integer> implements TemplateService{

}
