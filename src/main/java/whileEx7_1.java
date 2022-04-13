public class whileEx7_1 {
    public static void main(String[] args) {
        int i;
        i = 0;

        while (i < 5) {
            System.out.printf("[" + i + "] while 문을 공부합니다 \n");

            i++; // 안에 무조건 변수의 조건이 바뀔수 있을 만한 로직이 들어가야 함.
                 // 다른 말로 실행문 안에 아래에 조건에 변화를 줄 수 있는 로직이 반드시 들어가야 함. 안그럼 계속 돈다.
        }
    }
}
