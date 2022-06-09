package test0609;

public class test0609 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) { //예외 타입 Array~~~ : 배열의 인덱스가 실제 크기보다 큰 경우 발생하는 오류
            System.out.println("배열 첨자가 배열 크기보다 커요~");
        }
//        try {
//            //JAVA 코드...
//        } catch (예외 타입 e) {
//            //예외 발생시 이 부분이 실행됨
//        }
    }
}
