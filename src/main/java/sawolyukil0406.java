import java.util.Scanner;
public class sawolyukil0406 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("1~4중에 선택하세요 : ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.printf("1을 선택했다\n");
                
            case 2:
                System.out.printf("2를 선택했다\n");
                break;
            case 3 :
                System.out.printf("3을 선택했다\n");
                break;
            case 4:
                System.out.printf("4를 선택했다\n");
                break;
            default:
                System.out.printf("이상한걸 선택했다.\n");
/*
        a = s.nextInt();
        if (a == 1){
        System.out.println("1을 선택했다");
        }
        else if (a == 2){
            System.out.println("2를 선택했다");
        }
        else if (a == 3){
            System.out.println("3을 선택했다");
        }
        else if (a == 4){
            System.out.println("4를 선택했다");
        }
        else
            System.out.println ("이상한걸 선택했다"); */
        }
    }
}