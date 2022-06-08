//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class java_class_220518_map {
//
//    public static void main(String[] args) {
////        List<Map<String, String>> list1 = new ArrayList<Map<String, String>>();
//
//        List<Map<String, String>> list = new ArrayList<>(); // list 메모리 올림
//
//        Map<String, String> map = new HashMap<>(); // map 메모리 오림 <String, String = 키는 스트링, 벨류는 스트링>
//        map.put("name", "이협건"); //map name 추가
//        map.put("dept", "데이터분석과"); //map dept 추가
//
//        list.add(map); // list 이협건, 데이터분석 추가
//
//        map = null; // map 메모리 지우기
//
//        map = new HashMap<>(); //map 새롭게 올림
//        map.put("name", "홍길동");  // map name 추가
//        map.put("dept", "정보보안");  // map dept 추가
//
//        list.add(map);
//
//        map = null;
//
//        //↑ 1번 답
//
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("이협건");
//        list2.add("홍길동");
//
//        for (String name: list2) {
//            System.out.println("name : "+ name);
//        }
//
//        list2.forEach(name-> System.out.println("name : "+ name));
//        //↑ 2번 답
//
////       list.size()라는 size 함수 자체가 for문을 한번 돌리는것
//
//        // 최근 개발자들에게 인기 높은 컬렉션 객체를 조회하는 방법
//        // 람다식 : 자바 1.8버전부터 정상적으로 지원
//        // 단, 적용 가능한 경우가 제한적임
//        list.forEach(rMap -> {
//            System.out.println("name : " + rMap.get("name"));
//            System.out.println("email : " + rMap.get("email"));
//            System.out.println("addr : " + rMap.get("addr"));
//            System.out.println("dept : " + rMap.get("dept"));
//        }
//    }
//}