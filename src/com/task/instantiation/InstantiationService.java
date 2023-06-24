package com.task.instantiation;

import java.util.List;

/**
 * 实例化接口
 *
 * @author Minghua Ling
 */
public interface InstantiationService<T> {

    /**
     * 添加数据
     *
     * @param t 实体
     * @return 是否成功 true false
     */
    Boolean add(T t);

    /**
     * 修改数据
     *
     * @param t 实体
     * @param index index
     * @return 是否成功
     */
    Boolean update(T t, Integer index);

    /**
     * 获取列表数据
     *
     * @return list
     */
    List<T> getList();


    /**
     * 删除列表
     *
     * @return 是否成功
     */
    Boolean delete(int index);

}
