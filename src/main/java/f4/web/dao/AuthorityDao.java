package f4.web.dao;

import f4.web.entity.Authority;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by xuan on 16-10-30.
 */
@Repository
public interface AuthorityDao extends Mapper<Authority> {
}
