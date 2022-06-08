package Class;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class class4_Ex10_9 {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("/temp/data1.txt"); //← 파일링에 올려서 메모리에 올려라
        //"C:/temp/data1.txt"에서 C: 굳이 쓸 필요가 없음. 윈도우에선 c드라이브지만 리눅스,우분투에서 c드라이브가 없어 코드 반영이 안됨. 그래서 에러남.
        //편하게 코딩하고 싶으면 C:는 쓰지 마라
//        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8)


        //euc-kr
        //utf-8 (확장된 인코딩. 단어를 엄청나게 많이 만들어놨음. 한국어,일본어,영어,아랍어 등 그걸 다 통합해놓은 인코딩 세트.왠만한 한국언 다 됨
        int ch;

        while ( (ch = fis.read()) != -1) {
//        while ((ch = isr.read()) != -1 {
            System.out.print((char) ch);
        }
        fis.close();
    }
}
