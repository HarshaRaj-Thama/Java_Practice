public class Pattern {

    public static void main(String[] args) {
        String str1 = "1, 2, 3, 5";
        String [] numbers = str1.split(",");

        for (String number : numbers) {
            int num = Integer.parseInt(number.trim());
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
