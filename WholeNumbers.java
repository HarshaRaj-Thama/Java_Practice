import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//1 Print old numbers in a string format like [ "1", "2", "3"] using Java 8 stream
public class WholeNumbers {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()) {
            try {
                for (int i = 0; i < 5; i++) {
                    int n = scanner.nextInt();
                    list1.add(n);
                }
                System.out.println(list1);
                List<String> list2 = list1.stream().map(n -> "\"" + n + "\"").collect(Collectors.toList());
                System.out.println(list2);
            } catch (Exception e) {
                System.out.println("Try Again entering Whole numbers");

            }
//        }
    }
}
