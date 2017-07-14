package conditionl;

import org.springframework.stereotype.Service;

/**
 * Created by xjy on 2017/7/14.
 */
@Service
public class WindowsService implements OsService {
    public void show() {
        System.out.println("windows service");
    }
}
