package f4.web.dao;

import f4.web.entity.Trace;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by xuan on 16-10-30.
 */
@Repository
public interface TraceDao extends Mapper<Trace> {

    /**
     * 查询记录和学生记录
     *
     * @return
     */
    List<Trace> getAllTraceWithStudent();
}
