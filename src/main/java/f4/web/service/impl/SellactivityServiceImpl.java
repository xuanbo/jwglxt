package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Sellactivity;
import f4.web.service.SellactivityService;
import org.springframework.transaction.annotation.Transactional;

@Service("sellactivityService")
@Transactional
public class SellactivityServiceImpl extends BaseServiceImpl<Sellactivity,Integer> implements SellactivityService {

}
