package class0525_trainning;

public class class0525_3_method {
    public static void main(String[] args) {
        int i = 1, j = 10;

        int k = sum(i, j);
        System.out.println("k : " + k);

        int m = sum(10, 11);
        System.out.println("m : " + m);

    }

    public static int sum(int i1, int i2) {

        int sum = 0;

        for (int i = i1; i <= i2; i++) {
            sum += i;

        }
            return sum;
        }
}