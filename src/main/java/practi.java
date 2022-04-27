public class practi {
    public static void main(String[] args) {
//        for (int i = 3; i < 9; i++) {
//            for (int j = 2; j < 7; j++) {
//                System.out.printf("%d X %d = %d\n", i, j, i*j);
//            }
//            System.out.println("");
//        }
//    }
//}

        int hap = 0;
        for (int i = 50; i < 101; i++) {
            if ((i % 3 == 0) || (i % 7 == 0) || (i % 11 == 0)) {
            } else {
                hap = hap + i;
            }
        }
        System.out.printf("%d", hap);
    }
}