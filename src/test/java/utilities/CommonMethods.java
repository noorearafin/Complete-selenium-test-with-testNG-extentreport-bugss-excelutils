package utilities;

import drivers.BaseDriver;

public class CommonMethods extends BaseDriver {

    public void waittime() throws InterruptedException{
        Thread.sleep(2000);
    }
    public void waittime(int time) throws InterruptedException{
        Thread.sleep(time);
    }

}
