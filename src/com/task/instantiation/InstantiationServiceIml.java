package com.task.instantiation;

import java.util.ArrayList;
import java.util.List;

/**
 * 实例化
 *
 * @author Minghua Liang
 */
public class InstantiationServiceIml<T> implements InstantiationService<T> {

    /**
     * 存储对象
     *
     */
    private final ArrayList<T> list = new ArrayList<>();


    @Override
    public Boolean add(T o) {
        return list.add(o);
    }

    @Override
    public Boolean update(T o, Integer index) {
        return null;
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public Boolean delete(int index) {
        return list.remove(index) != null;
    }
}
