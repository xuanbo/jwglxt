package f4.web.dao;

import f4.web.entity.Communication;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by xuan on 16-10-30.
 */
@Repository
public interface CommunicationDao extends Mapper<Communication> {

    /**
     * 获取所有记录
     * 关联student
     *
     * @return
     */
    List<Communication> getAllCommunication();
}
