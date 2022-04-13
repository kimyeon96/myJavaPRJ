public class Ex06_14 {
    public static void main(String[] args) {
        int i, k;

        // 구구단은 2단부터 9단까지
        for(i = 2; i < 10; i++) {
            for (k = 1; k<10; k++) { // 2단 - 9단
                System.out.printf("%d X %d = %d\n",i,k,i*k);
            }
            System.out.printf("/n");
        }
    }
}
