class FizzBuzz {
    private int n;
    private int curr = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while (curr <= n) {
            if (curr % 3 != 0 || curr % 5 == 0) {
                wait();
                continue;
            }
            printFizz.run();
            curr += 1;
            notifyAll();
        }

    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while (curr <= n) {
            if (curr % 5 != 0 || curr % 3 == 0) {
                wait();
                continue;
            }
            printBuzz.run();
            curr += 1;
            notifyAll();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (curr <= n) {
            if (curr % 15 != 0) {
                wait();
                continue;
            }
            printFizzBuzz.run();
            curr += 1;
            notifyAll();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while (curr <= n) {
            if (curr % 3 == 0 || curr % 5 == 0) {
                wait();
                continue;
            }
            printNumber.accept(curr);
            curr += 1;
            notifyAll();
        }
    }
}