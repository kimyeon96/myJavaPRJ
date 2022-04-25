public class dd {
    public static void main(String[] args) {
        int hap = 0;
        int i;
        for(i = 50; i < 101; i++) {
            if (i%3 == 0 || i%7==0 || i%11==0) {
                continue;
            }
            hap += i;
        }
        System.out.println(hap);
    }
}
