public class star_test000000 {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            for (int j=1; j<=3-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=2; i>0; i--) {
            for (int j=2; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}