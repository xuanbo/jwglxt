package f4.web.service.impl;

import f4.web.entity.Menu;
import f4.web.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试
 *
 * Created by xuan on 16-10-28.
 */
@Service("menuService")
@Transactional
public class MenuServiceImpl extends BaseServiceImpl<Menu, Integer> implements MenuService {

}
