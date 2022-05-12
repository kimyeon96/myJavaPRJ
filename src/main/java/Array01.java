public class Array01 {
    public static void main(String[] args) {

        int[] num = new int[5];

        for (int i = 0; i<num.length; i++) {
            num[i] = i+1;
        }

        for(int i = 0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }
}