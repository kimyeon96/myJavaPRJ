package class0525_trainning;

import java.util.Scanner;

public class class0525_4_Ex9_11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int coffee;
        int ret;

        System.out.println("어떤 커피를 탈까요? (1:보통, 2:설탕, 3:블랙) ");
        coffee = s.nextInt();

        CoffeeMachine cm = new CoffeeMachine();
        cm.coffee_machine(coffee);

//        if (ret == 0) {
//            System.out.println("함수 실행 성공");
//        }


        System.out.printf("손님~ 커피 여기 있습니다.\n");
    }
}
