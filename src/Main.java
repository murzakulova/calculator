public class Main {
    public static void main(String[] args) {
        int summa =cals(20,20)+cal(12,7)+ca(7,5)+c(40,5);
        System.out.println(summa);
    }

    public static int cals(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int cal(int a, int b) {
        int sum1 = a - b;
        return sum1;
    }

    public static int ca(int a, int b) {
        int sum2 = a * b;
        return sum2;
    }

    public static int c(int a, int b) {
        int sum3 = a / b;
        return sum3;


    }
}