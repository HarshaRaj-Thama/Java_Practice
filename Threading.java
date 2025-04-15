public class Threading {
    static final Object lock = new Object();
    static boolean isThread1Turn = true;
    public static void main(String[] args) {
//        MyRunnable myrunnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable1());
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Try_Again");
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i =1 ; i<= 5 ; i++){
            synchronized (Threading.lock){
                while (!Threading.isThread1Turn){
                    try{
                        Threading.lock.wait();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.print(i);
                Threading.isThread1Turn = false;
                Threading.lock.notify();
            }
        }
    }
}
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for(int i =6 ; i<= 10 ; i++){
            synchronized (Threading.lock){
                while (Threading.isThread1Turn){
                    try{
                        Threading.lock.wait();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.print(i);
                Threading.isThread1Turn = true;
                Threading.lock.notify();
            }
        }
    }
}
