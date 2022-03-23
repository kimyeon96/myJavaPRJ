public class Practice2 {
    public static void main(String[] args) {
        int dan = 2;
        int times = 1;

        for (dan = 2; dan <= 5; dan++) {
            for (times = 1; times < 10; times++) {
                if (dan==2 || dan == 4) break;
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
        }
    }
}