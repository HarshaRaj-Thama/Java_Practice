import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//4 sorted on 2 digit in sum of two digit
//input = [ 30,40,50,66,33,75,88,91] output = [30,40,50,91,33,75,66,88] using java 8 we need to
//sorted second digit in a number
public class SortNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30,40,50,66,33,75,88,91);

        List<Integer> sorted = list.stream()
                                    .sorted(Comparator.comparingInt(n -> n % 10))
                                    .toList();

        System.out.println(sorted);


    }
}
