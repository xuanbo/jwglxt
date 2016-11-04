package f4.web.dao;

import f4.web.entity.Audition;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by xuan on 16-10-30.
 */
@Repository
public interface AuditionDao extends Mapper<Audition> {

    /**
     * 获取试听记录
     * 关联学生
     *
     * @return
     */
    List<Audition> getAllAuditionWithStudent();
}
