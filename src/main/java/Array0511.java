import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array0511 {
    public static void main(String[] args) {
        List<String> plist = new ArrayList<>();

        plist.add("이협건");
        plist.add("홍길동");
        plist.add("임꺽정");
        plist.add("고길동");
        plist.add("둘리");
        plist.add("희동이");


        //출력하는 방식
        //최근 개발자들에게 인기 높은 컬렉션 객체를 조회하는 방법
        //람다식 : 자바 1.8버전부터 정상적으로 쓰임
        //단, 적용 가능한 경우가 제한적인
        plist.forEach(name -> System.out.println("name : " + name));
//    }
//}

//foreach문으로 조회
        for (String name : plist) {
            System.out.println("이름 : " + name);
        }

        Iterator<String> it = plist.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}