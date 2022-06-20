package class0615_2;

//@Setter
//@Setter
public class ExamDTO {

    private String test; //외부에서 절대 이 변수를 건들지 못함
    private int score;

    //get은 가져오다, set은 저장하다
    // alt + Insert -> getter and setter -> 가져옴
    public String getTest() {  // 함수에서 건드릴수 있음, 외부에서 건드릴수 있음
        return test;
    }

    public void setTest(String test) {
        this.test = test; //여기서 this는 ExamDTO를 얘기함 // 파라미터일때 test랑 위 String의 test인지 구분하기 위해 this를 붙였다
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
