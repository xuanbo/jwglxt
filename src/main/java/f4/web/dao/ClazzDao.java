package f4.web.dao;

import f4.web.entity.Clazz;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by xuan on 16-10-30.
 */
@Repository
public interface ClazzDao extends Mapper<Clazz> {

    /**
     * 查询所有班级
     * 关联课程、学科、老师、教室
     *
     * @return
     */
    List<Clazz> getClazzAll();

    /**
     * 根据id查询班级
     * 关联课程、学科、老师、教室
     *
     * @param id
     * @return
     */
    Clazz getClazzById(Integer id);
}
