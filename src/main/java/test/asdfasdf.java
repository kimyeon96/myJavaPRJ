package test;

import java.util.ArrayList;
import java.util.List;

public class asdfasdf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("김연");
        list.add("이정훈");
        list.add("박우정");
        list.add("김다운");

        list.forEach(name -> System.out.println("name : " + name));
        }
    }