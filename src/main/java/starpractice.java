public class starpractice {
    public static void main(String[] args) {

        for (int i=1; i<=3; i++) {
            for (int j=0; j<3-i; j++) {
                System.out.printf(" ");
            }
            for ( int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
