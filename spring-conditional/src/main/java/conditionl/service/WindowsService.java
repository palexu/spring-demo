package conditionl.service;

import org.springframework.stereotype.Service;

/**
 * Created by xjy on 2017/7/14.
 */
public class WindowsService implements OsService {
    public void show() {
        System.out.println("windows service");
    }
}
