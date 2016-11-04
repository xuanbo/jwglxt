package f4.web.service;

import f4.web.entity.Clazz;

import java.util.List;

public interface ClazzService  extends BaseService<Clazz, Integer>  {

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
