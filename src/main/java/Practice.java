public class Practice {
    public static void main(String[] args) {
        int dan = 3;
        int times = 0;

        for (dan = 3; dan < 6; dan++) {
            for (times = 1; times<10; times++) {
                if(dan == 4) continue;
                System.out.println(dan + "X" + times + "=" + dan*times);
            }
        }
    }
}
