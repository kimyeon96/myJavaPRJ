package class0615_2;

    public class Car1 {

        private int price;

        Car1() {
            System.out.println("난 메모리에 올라갈때 생성된다.");
        }

        public Car1(int num) { //이렇게 내가 커스터마이징ㅎ ㅐ서 쓸수 도 있다 -는게 생성자
            this.price = num; //변수에 있는 값까지 올리고 싶을때
            //(생성자는) 메모리에 올라갈때만 생성이 됨 (그리고 실행할수 있음)
            System.out.println("가격 : " + this.price);
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }


