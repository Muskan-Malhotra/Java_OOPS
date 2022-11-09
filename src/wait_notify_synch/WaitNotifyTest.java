package wait_notify_synch;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("old.starting message");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiterthrd").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1thrd").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifierthrd").start();
        System.out.println("All the threads are started");
    }

}
