public class IncreasingAndDecreasingTriangle {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1 ; i<= 6 ; i++) {
            for (int j = i; j <= 6; j++) {
                System.out.print(" ");
                count++;
            }
            for(int j = 1; j <= 6 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
