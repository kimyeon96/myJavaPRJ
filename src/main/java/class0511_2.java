import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class0511_2 {
//ListMapExam
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        // 이협건 정보 저장하기
        map.put("name", "이협건");
        map.put("email", "hglee97@kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map); // 앞서 등록한 이협건 정보를 list에 저장하기

        map = null; // 메모리에 데이터를 지우는 방식으로 이협건 정보를 삭제하기

        // 기존 map 객체의 값을 새롭게 생성하기
        map = new HashMap<>();

        // 홍길동 정보 저장하기
        map.put("name", "홍길동");
        map.put("email", "g.d.hong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map); // 앞서 등록한 홍길동 정보를 list에 저장하기

        map = null; // 메모리에 데이터를 지우는 방식으로 이협건 정보를 삭제하기

        int listSize = list.size();

        for (int i = 0; i<listSize; i++) {

            Map<String, String> rMap = list.get(i);
            System.out.println("name : "+ rMap.get("name"));
            System.out.println("email : "+ rMap.get("email"));
            System.out.println("addr : "+ rMap.get("addr"));
            System.out.println("dept : "+ rMap.get("dept"));
            System.out.println("------------------------");
        }
    }
}
