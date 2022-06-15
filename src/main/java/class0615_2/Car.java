package class0615_2;

public class Car {
    // 자동차의 필드
    String color;
    int speed;
    // 자동차의 메소드
    void upSpeed(int value) {
        speed = speed + value;
    }
    void downSpeed(int value) {
        speed = speed - value;
    }
}
