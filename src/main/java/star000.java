public class star000 {
    public static void main(String[] args) {
        System.out.println("방법 1------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); //공백
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); //별반
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* "); //나머지 별반틈.
            }
            System.out.println();

        }
        //하단
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("* ");
            }
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}