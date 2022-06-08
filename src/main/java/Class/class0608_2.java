package Class;

public class class0608_2 {
    public static void main(String[] args) {

        int[] aa = new int[3];

        try {
            aa[2] = 100 / 0; //위에 오류를 잡으면 바로 catch로 가고 아래 오류는 실행을 안한다
            aa[3] = 100; //없는 배열에 값을 넣으려는 에러

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 첨자가 배열의 크기보다 커요");
            System.out.println("에러 메시지 : " + e);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등 오류에요");
            System.out.println("에러 메시지 : "+ e);

        } catch (Exception e) {
            System.out.println("난 모든 에러를 다 잡아요");
            System.out.println("에러 메시지 : " + e); //catch의 마지막에는 항상 얘가 들어가야한다.
            //↑자바에서 발생하는 모든 오류는 다 잡는다
            //위부터 (최상위부터) catch의 순서로 잡는다

        } finally {
            System.out.println("이 부분은 무조건 나와요"); //에러가 나던 안나던 얘(finally)는 무조건 실행, 필수는 아님,
            //하지만 실제 코딩한다고 하면 보통 무조건 쓴다
        }
    }
}
