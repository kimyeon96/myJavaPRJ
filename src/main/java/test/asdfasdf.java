package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class asdfasdf {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();

        map.put("name","김연");
        map.put("dept","데이터분석");
        map.put("age","27");
        map.put("grade","1학년");

        list.add(map);
        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("email","abce@kopo.ac.kr");
        map.put("addr","서울");
        map.put("dept","정보보안과");

        list.add(map);
        map = null;

        for (Map<String,String> name : list) {
            System.out.println("name : " + list);
        }
        list.forEach(rmap -> {
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("addr"));
            System.out.println("dept : " + rmap.get("dept"));
        } );
        }
    }