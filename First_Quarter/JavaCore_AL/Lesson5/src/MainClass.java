import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    //Пример
    static class ATM{
        int money;

        public ATM (int money) {
            this.money = money;
        }

        public void takeMoney (String name, int amount){
            if (money >= amount) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money -= amount;
                System.out.println(name + " take " + amount);
            } else {
                System.out.println(name + " not enough money");
                info();
            }
        }

        public void info() {
            System.out.println("ATM " + money);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(100);
        new Thread(() -> {atm.takeMoney("Bob1", 50);}).start();
        new Thread(() -> {atm.takeMoney("Bob2", 50);}).start();
        new Thread(() -> {atm.takeMoney("Bob3", 50);}).start();






//        //Синхронизация методов
//        Counter counter = new Counter();
//        System.out.println(counter.value());
//
//        Thread t61 = new Thread(()-> {
//            for (int i = 0; i < 100_000; i++) {
//                counter.inc();
//                try{
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread t62 = new Thread(()-> {
//            for (int i = 0; i < 100_000; i++) {
//                counter.dec();
////                try{
////                    Thread.sleep(1);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//            }
//        });
//
//        t61.start();
//        t62.start();
//
//        try{
//            t61.join();
//            t62.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(counter.value());
//    }

        //Потоки Daemon(); - служебный поток, который не ждут
//        Thread t51 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int time = 0;
//                while (true) {
//                    time++;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(time);
//                }
//            }
//        });
//        t51.setDaemon(true);
//        t51.start();
//        System.out.println("End");


        //Метод Join();
//        Thread t41 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println(i);
//                }
//            }
//        });
//        t41.start();
//        try {
//            t41.join();
//        } catch (Interrup tedException e) {
//            e.printStackTrace();
//        }
//
//        Thread t43 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 6; i <= 10; i++) {
//                    System.out.println(i);
//                }
//            }
//        });
//        t43.start();
//        try {
//            t43.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("End");

//        Thread t31 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true)
//                System.out.println("C");
//            }
//        });
//        t31.start();
//
//        Thread t32 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true)
//                System.out.println("D");
//            }
//        });
//        t32.start();

        //Метод SetPriority();
//        Thread t21 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("A");
//            }
//        });
//        t21.setPriority(5);
//        t21.start();


        //Executor();
//        //ExecutorService service = Executors.newFixedThreadPool(10); //Фиксированное число потоков
//        ExecutorService service = Executors.newCachedThreadPool(); //Не фиксированное число потоков
//
//        service.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("A");
//            }
//        });
//        service.shutdown();

//        new Thread(() -> System.out.println("A")).start();
//        new Thread(() -> System.out.println("B")).start();

//        Thread t1A = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("A");
//            }
//        });
//
//        Thread t1B = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("B");
//            }
//        });
//
//        t1A.start();
//        t1B.start();

        //System.out.println(Thread.currentThread().getName());
//        MyThread t11 = new MyThread();
//        MyThread t12 = new MyThread();
//        t11.start();
//        t12.start();
//
//        Thread t13 = new Thread(new MyRunnable());
//        Thread t14 = new Thread(new MyRunnable());
//        t13.start();
//        t14.start();

    }
}
