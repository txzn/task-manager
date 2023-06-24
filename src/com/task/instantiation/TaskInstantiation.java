package com.task.instantiation;

import com.task.entity.Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 任务实例化
 *
 * @author Minghua Ling
 */
public class TaskInstantiation {

    private static final InstantiationService<Task> taskInstantiationService = new InstantiationServiceIml<>();

    /**
     * 初始化数据
     */
    public static void initDataList(){

        // 读取文件

        // 将数据放入列表中
    }

    /**
     * 设置数据
     * @param task task
     * @return 是否成功
     */
    public static Boolean add(Task task){
        return taskInstantiationService.add(task);
    }

    /**
     * 获取列表数据
     *
     * @return 列表
     */
    public static List<Task> getList(){
        List<Task> list = taskInstantiationService.getList();
        return new ArrayList<>(list);
    }


    public static Boolean delete(Integer index){
        return taskInstantiationService.delete(index);
    }

}
