package D2022518;

public class java_class_0518_6_toUppercase {
    public static void main(String[] args) {
        //실습 9-6
        String str = "  한글   ABCD efgh   ";
        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 문자열==> [" + str.trim() + "]");
        System.out.println("전체공백제거 ==> [" + str.replaceAll(" ", ""));
    }
}