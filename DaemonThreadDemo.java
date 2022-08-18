class MyThread extends Thread {
    // @override
    public void ren() {
        System.out.println("Non-DaemonThread");
    }
}

public class DaemonThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        System.out.println("Before using SetDaemon() method:- ");

        System.out.println("IS" + mt.getName() + "a Daemon thread:- " + mt.isDaemon());

        mt.setDaemon(true);
        System.out.println("After using setDaemon() method:- ");

        System.out.println("IS" + mt.getName() + "a Daemon Thread:- " + mt.isDaemon());
    }
}
