import java.util.Scanner;

public class Scannerdemo {
    public static void main(String[] args) {
            Scanner integer = new Scanner(System.in);
//            String alpha = integer.nextLine();

        System.out.print("Enter Your Favorite Number :");
//        String name = integer.next();
//        int number = integer.nextInt();
        System.out.println(integer.nextLine() + "! you are " + integer.nextInt() + " years old!");
    }


}

