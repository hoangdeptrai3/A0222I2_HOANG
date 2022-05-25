package demo;

public class Fibonacci {
        private int maxNumber;

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
    public int [] fibonacci() {
        int [] arrfibonacci=new int[maxNumber];

        int previousNumber = 0, nextNumber = 1;
        int i = 0;
        while (i < maxNumber) {
            arrfibonacci[i]=previousNumber;
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
        return arrfibonacci;
    }
    public int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {

            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    public int [] fibonacciRecursion() {

        int [] arrfibonacci = new int[maxNumber];
        for (int i = 0; i < maxNumber; i++) {
            arrfibonacci[i]=fibonacciRecursion(i);

        }
        return arrfibonacci;
    }

    public static void main(String[] args) {
        Fibonacci sc = new Fibonacci();
        int [] arr;

        System.out.println("kq"+sc.fibonacci());
        sc.fibonacciRecursion();
        sc.fibonacciRecursion(10);
    }
    }

