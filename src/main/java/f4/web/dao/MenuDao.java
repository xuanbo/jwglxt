package f4.web.dao;

import f4.web.entity.Menu;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 测试
 *
 * Created by xuan on 16-10-28.
 */
@Repository
public interface MenuDao extends Mapper<Menu> {
}
