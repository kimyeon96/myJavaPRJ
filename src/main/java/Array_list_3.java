import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_list_3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");
        list.add("둘리");
        list.add("희동이");

        //List의 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 확인하기 위해서는 반복문을 사용함

        // 우리가 지난 시간에 배운 방법
        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }
    }
}


//무조건 외우자, 스프링 할때도 쓸거고
// 평생 쓸거라서 무조건 외우자, 계속 따라간다.
