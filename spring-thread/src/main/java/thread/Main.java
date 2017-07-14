package thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xjy on 2017/7/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsycTaskService asycTaskService = context.getBean(AsycTaskService.class);

        for (int i = 0; i < 10; i++){
            asycTaskService.executeAsycTask(i);
            asycTaskService.executeAsycTaskPlugs(i);
        }
    }
}
