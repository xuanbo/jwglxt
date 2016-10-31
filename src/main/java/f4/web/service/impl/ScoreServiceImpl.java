package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Score;
import f4.web.service.ScoreService;
import org.springframework.transaction.annotation.Transactional;

@Service("scoreService")
@Transactional
public class ScoreServiceImpl extends BaseServiceImpl<Score,Integer> implements ScoreService {

}
