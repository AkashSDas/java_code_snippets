package Learn;

public class MulitThreadling {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        hello.start();

        Bye bye = new Bye();
        // While using implementing Runnable interface in your custom
        // class you need to create a Thread object and pass your custom
        // class's object in order to use the start method
        Thread thread = new Thread(bye);
        thread.start();

        // Shorthands for writing small code & achieve
        Runnable runnableObj = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Short");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        };
        Thread shortcutThread = new Thread(runnableObj);
        shortcutThread.start();

        Thread veryShortcutThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Very short");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        veryShortcutThread.start();
    }
}

// Extending Thread
class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

// Using interface
class Bye implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Bye");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
