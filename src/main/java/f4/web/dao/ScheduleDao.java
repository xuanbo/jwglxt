package f4.web.dao;

import f4.web.entity.Schedule;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by xuan on 16-10-30.
 */
@Repository
public interface ScheduleDao extends Mapper<Schedule> {
}
