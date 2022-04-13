public class gugudan_solo {
    public static void main(String[] args) {
        int i, k;

        // 총 실행 횟수 : 3 * 2 = 6번
        for (i = 0; i < 3; i++) { // 3번반복
            for (k = 0; k <2; k++) { // 2번반복
                System.out.printf("중첩 for 문입니다. (i값: %d, k값: %d \n", i, k);
            }
        }
    }
}
