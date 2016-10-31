package f4.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import f4.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuan on 16-10-28.
 */
@Service
public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

    @Autowired
    private Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public int insert(T t) {
        return mapper.insert(t);
    }

    @Override
    public List<T> select(T t) {
        return mapper.select(t);
    }

    @Override
    public T selectOne(T t) {
        return mapper.selectOne(t);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public int update(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    @Override
    public int deleteById(ID id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<T> getByPage(Integer current, Integer size) {
        PageHelper.startPage(current, size);
        return new PageInfo<T>(mapper.selectAll());
    }
}
