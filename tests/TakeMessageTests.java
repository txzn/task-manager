import com.task.entity.Task;
import com.task.instantiation.TaskInstantiation;

import java.util.Arrays;
import java.util.List;

/**
 * 任务类测试
 *
 * @author Minghua Ling
 */
public class TakeMessageTests {
    public static void main(String[] args) {
        Task task = new Task();

        task.setTitle("1");
        task.setDescribe("123456");

        TaskInstantiation.add(task);

        List<Task> list = TaskInstantiation.getList();

        for (Task task1 : list) {
            System.out.println(task1.toString());
        }

        TaskInstantiation.delete(0);

        List<Task> lists = TaskInstantiation.getList();

        for (Task task1 : lists) {
            System.out.println(task1.toString());
        }
    }
}
