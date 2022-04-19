public class test00000000001 {
    public static void main(String args[]) {
        int hap = 0;

        for (int a = 1; a < 101; a++) {
            if (a % 15 == 0) {
                hap = hap + a;
            }
        }
        System.out.printf("%d", hap);
    }
}