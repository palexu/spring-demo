package thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by xjy on 2017/7/14.
 */
@Service
public class AsycTaskService {
    /*
    通过@Async注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法，
    而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor。
     */

    @Async
    public void executeAsycTask(Integer i) {
        System.out.println("执行异步任务:" + i);
    }

    @Async
    public void executeAsycTaskPlugs(Integer i) {
        System.out.println("执行异步任务 plugs:" + i);
    }
}
