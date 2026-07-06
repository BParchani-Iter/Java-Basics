package threads;

class MyTask implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " - Message" + i);


            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

class MultiThreading {
    public static void main(String[] args){
        MyTask task = new MyTask();

        Thread thread1 = new Thread(task, "Thread - A");
        Thread thread2 = new Thread(task, "Thread - B");

        System.out.println("Thread A starting ...");
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Thread A completed");
        System.out.println("Thread B starting ...");

        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed.");

    }
}


