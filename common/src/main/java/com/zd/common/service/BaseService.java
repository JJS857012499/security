package com.zd.common.service;

import lombok.Data;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Data
public abstract class BaseService<M extends BaseMapper<T>, T> {

    private M mapper;

    public int insert(T record) {
        return mapper.insert(record);
    }

    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    public List<T> select(T record) {
        return mapper.select(record);
    }

    public List<T> selectAll() {
        return mapper.selectAll();
    }

    public long selectCount(T record) {
        return new Long(mapper.selectCount(record));
    }

    public T selectByPrimaryKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int delete(T record) {
        return mapper.delete(record);
    }

    public int deleteByPrimaryKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }
}
