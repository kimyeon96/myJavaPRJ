public class Ex07_10 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for (i = 1; i <= 100; i++) {
            if (i%3 != 0)
//                continue;

            hap += i;
        }

        System.out.printf(" 1~100의 합(3의 배수 제외) : "+hap);
    }
}
