package moonjo;

public class CountThread extends Thread {

    Object object = new Object();
    public CommonResource res;

    public CountThread(CommonResource res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (object) {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
