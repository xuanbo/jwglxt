package f4.web.service;

import f4.web.entity.Communication;

import java.util.List;

public interface CommunicationService  extends BaseService<Communication, Integer>  {

    /**
     * 获取所有记录
     * 关联student
     *
     * @return
     */
    List<Communication> getAllCommunication();
}
