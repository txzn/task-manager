package com.task.service;

import com.task.entity.Task;

import java.util.List;

/**
 *  任务服务接口，提供基本的任务服务
 *
 * @author Minghua Liang
 */
public interface TakeMessageService {

    /**
     * 获取任务列表
     *
     * @return 任务列表
     */
    List<Task> getTakeList();

    /**
     * 添加任务
     *
     * @param task 任务
     * @return 是否添加成功 true false
     */
    Boolean addTakeList(Task task);

    /**
     * 修改任务
     *
     * @param task 任务
     * @param index 所在列表的位置
     * @return 修改任务
     */
    Boolean updateTakeList(Task task, Integer index);


    /**
     *
     * 获取任务
     *
     * @param index 任务索引
     * @return 获取任务
     */
    Task getTask(Integer index);

}
