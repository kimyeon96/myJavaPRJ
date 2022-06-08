package class0525_trainning;

import java.util.Scanner;

public class CoffeeMachine {

    public int coffee_machine(int button) {
        System.out.println("\n 1. 자동으로 뜨거운 물을 준비한다.");
        System.out.println("# 2. 종이컵을 준비한다.");

        switch (button) {
            case 1:
                System.out.printf("# 3.(자동으로) 보통 커피를 탄다.\n");
                break;
            case 2:
                System.out.printf("# 3. 설탕 커피를 탄다.\n");
                break;
            case 3:
                System.out.printf("# 3. 블랙 커피를 탄다.\n");
                break;
            default:
                System.out.println("# 3. 아무거나 탄다.");
                break;
        }

        System.out.println("4. 물을 붓는다.");
        System.out.println("5. 스푼으로 저어서 녹인다.");

        return 0;
    }

    public class class0525_4_Ex9_11 {


        public void main(String[] args) {

            Scanner s = new Scanner(System.in);

            int coffee;
            int ret;

            System.out.println("어떤 커피를 탈까요? (1:보통, 2:설탕, 3:블랙) ");
            coffee = s.nextInt();

            ret = coffee_machine(coffee);

//        if (ret == 0) {
//            System.out.println("함수 실행 성공");
//        }


            System.out.printf("손님~ 커피 여기 있습니다.\n");
        }
    }
}
