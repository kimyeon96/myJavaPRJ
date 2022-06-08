package class0525_trainning;

public class class0525_2_equals {
    public static void main(String[] args) {
        String str1 = "Java Programing"; //메모리 올림
        String str2 = "Java Programing"; // 똑같이 메모리올림
        String str3 = new String("Java Programing"); //new로 메모리 안올리는데 올리네? 특이케이스 설명
        //java,c가 컴파일 언어, 파이썬,?? 가 인터프리터
        //str1,str2 데이터 메모리 효율 높여주기 위해서 이름만 다를뿐 저장되는 곳은 같고(같은 거 저장할땐 같은 공간(주소)에 넣어준거, 같은 메모리에 넣어준거) (메모리 효율성 높여주기 위해)
        // new는 새로 올려준거

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열1 ==> [" + str2 + "]");
        System.out.println("원 문자열1 ==> [" + str3 + "]");

        System.out.println("문자열1 == 문자열2 결과 : " + str1 == str2); //문자열에서 값을 비교할때는 스트링에서 같은 ==못쓴다, 무조건 equals
        System.out.println("문자열1.equals(문자열2) 결과 : " + str1.equals(str2)); //문자열에서 값을 비교할때는 스트링에서 같은 ==못쓴다, 무조건 equals
        System.out.println("문자열1 == 문자열3 결과 : " + str1 == str3);
        System.out.println("문자열1.equals(문자열3) 결과 : " + str1.equals(str3));

        System.out.println("문자열1과 문자열2가 다른지 비교 compareTo 안쓰고, 이렇게 함 : " + !str1.equals(str2));
        //compare는 잘 안씀
    }
}
