import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // ArrayList로 메모리에 올림

        // list 객체에 데이터 추가
        list.add("이협건");
        list.add("홍길동"); // 데이터 저장
        list.add("이정훈");
        list.add("김정엽");

        int listSize = list.size(); //List의 데이터 수 구하기

        for (String name : list) {
        }
    }
}
