package f4.web.service;

import f4.web.entity.Audition;

import java.util.List;

public interface AuditionService extends BaseService<Audition, Integer>  {

    /**
     * 获取试听记录
     * 关联学生
     *
     * @return
     */
    List<Audition> getAllAuditionWithStudent();
}
