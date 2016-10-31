package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Score;
import f4.web.service.ScoreService;

@Service("scoreService")
public class ScoreServiceImpl extends BaseServiceImpl<Score,Integer> implements ScoreService {

}
