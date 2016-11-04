package f4.web.service;

import f4.web.entity.Score;

import java.util.List;

public interface ScoreService extends BaseService<Score, Integer>  {

    /**
     * 获取成绩
     * 关联student
     *
     * @return
     */
    List<Score> getAllScore();
}
