public class Thread {
    public static void main(String[] args) {
        new MyThread1(new Counter());
        new MyThread2(new Counter());
        new MyThread3(new Counter());
        new MyThread4(new Counter());

        Counter counter = new Counter();
        new MyThread1(counter);
        new MyThread2(counter);

        new PriorityThread1(new Counter(), 10);
        new PriorityThread2(new Counter(), 1);

        new WeirdThread1(new WeirdCounter(true));
        new WeirdThread2(new WeirdCounter(false));

        OddCounter oddCounter = new OddCounter();
        new MyThread5(oddCounter);
        new MyThread6(oddCounter);
    }
}

class Counter {
    int num = 0;

    public void showCount(String threadName) {
        this.num++;
        System.out.println(threadName + ": " + this.num);
    }
}

class MyThread1 extends Thread {
    Counter counter;

    public MyThread1(Counter counter) {
        this.counter = counter;
        this.start();
    }

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            counter.showCount("Thread1");
        }
    }
}

class MyThread2 extends Thread {
    Counter counter;

    public MyThread2(Counter counter) {
        this.counter = counter;
        this.start();
    }

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            counter.showCount("Thread2");
        }
    }
}

class MyThread3 extends Thread {
    Counter counter;

    public MyThread3(Counter counter) {
        this.counter = counter;
        this.start();
    }

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            counter.showCount("Thread3");
        }
    }
}

class MyThread4 extends Thread {
    Counter counter;

    public MyThread4(Counter counter) {
        this.counter = counter;
        this.start();
    }

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            counter.showCount("Thread4");
        }
    }
}

// =========================
// Practical 7 Q.1 c
// =========================
class PriorityThread1 extends Thread {
    Counter counter;

    public PriorityThread1(Counter counter, int priority) {
        this.counter = counter;
        this.setPriority(priority); // Setting priority
        this.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.showCount("PriorityThread1");
        }
    }

    // Getting priority
    public int getThreadPriority() {
        return super.getPriority();
    }
}

class PriorityThread2 extends Thread {
    Counter counter;

    public PriorityThread2(Counter counter, int priority) {
        this.counter = counter;
        this.setPriority(priority); // Setting priority
        this.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.showCount("PriorityThread2");
        }
    }

    // Getting priority
    public int getThreadPriority() {
        return super.getPriority();
    }
}

// =========================
// Practical 7 Q.1 d
// =========================
class WeirdCounter {
    // To start the 1st thread(which stop when num==6) after 2nd thread completes
    static boolean stop = false;

    int num = 0;
    boolean stopAt6;

    public WeirdCounter(boolean stopAt6) {
        this.stopAt6 = stopAt6;
    }

    public synchronized void FirstThread() {
        if (this.stopAt6 == true && this.num == 6) {
            WeirdCounter.stop = true;
        }
        while (WeirdCounter.stop) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println(String.format("Frist thread: %d", this.num));
        this.num++;
        notify();
    }

    public synchronized void SecondThread() {
        System.out.println(String.format("Second thread: %d", this.num));
        if (this.num == 10) {
            WeirdCounter.stop = false;
        }
        this.num++;
        notify();
    }
}

class WeirdThread1 extends Thread {
    WeirdCounter counter;

    public WeirdThread1(WeirdCounter counter) {
        this.counter = counter;
        this.start();
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            counter.FirstThread();
        }
    }
}

class WeirdThread2 extends Thread {
    WeirdCounter counter;

    public WeirdThread2(WeirdCounter counter) {
        this.counter = counter;
        this.start();
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            counter.SecondThread();
        }
    }
}

// =========================
// Practical 7 Q.2
// =========================
class OddCounter {
    static int num = 1;
    static boolean turn = false;

    public synchronized void FirstThreadTurn() {
        while (OddCounter.turn) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        OddCounter.num += 2;
        System.out.println(String.format("First thread: %d", OddCounter.num));
        OddCounter.turn = true;
        notify();
    }

    public synchronized void SecondThreadTurn() {
        while (!OddCounter.turn) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        OddCounter.num += 2;
        System.out.println(String.format("Second thread: %d", OddCounter.num));
        OddCounter.turn = false;
        notify();
    }
}

class MyThread5 implements Runnable {
    OddCounter oddCounter;

    public MyThread5(OddCounter oddCounter) {
        this.oddCounter = oddCounter;
        Thread thread = new Thread(this, "MyThread5");
        thread.start();
    }

    public void run() {
        while (true) {
            oddCounter.FirstThreadTurn();
        }
    }
}

class MyThread6 implements Runnable {
    OddCounter oddCounter;

    public MyThread6(OddCounter oddCounter) {
        this.oddCounter = oddCounter;
        Thread thread = new Thread(this, "MyThread6");
        thread.start();
    }

    public void run() {
        while (true) {
            oddCounter.SecondThreadTurn();
        }
    }
}
