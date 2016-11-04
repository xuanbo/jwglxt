package f4.web.dao;

import f4.web.entity.Score;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by xuan on 16-10-30.
 */
@Repository
public interface ScoreDao extends Mapper<Score> {

    /**
     * 获取成绩
     * 关联student
     *
     * @return
     */
    List<Score> getAllScore();
}
