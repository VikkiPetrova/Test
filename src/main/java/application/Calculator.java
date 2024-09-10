package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {return a - b;}

    public int multiplication(int a, int b) {return a * b;}


    public int division(int a, int b) {return a / b;}

    public double squareRoot(double a) {return Math.sqrt(a);}

    public double xSquared(double a) {return a * a;}

    //***************Medium methods************************

    public double average(int a, int b, int c) {return (a + b + c) / 3;}

    public boolean evenOrOdd(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int biggestValue(int a, int b) {

            return Math.max(a, b);
        }


    //***************Hard methods************************

    public int addMultipleValues(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public int divideByZero(int a, int b) {
        if (b == 0) {
            return -100;
        }
        return a / b;
    }


}





