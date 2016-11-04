package f4.web.service.impl;

import f4.web.dao.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f4.web.entity.Score;
import f4.web.service.ScoreService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("scoreService")
@Transactional
public class ScoreServiceImpl extends BaseServiceImpl<Score,Integer> implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    @Override
    public List<Score> getAllScore() {
        return scoreDao.getAllScore();
    }
}
