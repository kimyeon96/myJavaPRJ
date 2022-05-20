package D2022518;

public class java_class_0518_2 {
//교재302p
    public static void main(String[] args) {

        String str = "IT CookBook. java";
        int len;
        len = str.length();

        System.out.printf("문자열 : %s \n", str );
        System.out.printf("문자열 길이 : %d \n", len );

        if (str.length()>0) {
            System.out.println("str 변수에 값이 존재한다.");

        } else {
            System.out.println("str 변수에 값이 존재안한다.");
        }
    }
}
