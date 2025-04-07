import java.util.Arrays;
import java.util.Random;

public class DescArray
{
    public static void main(String[] args) {
        int[] generateArray=  getRandomArray(10);
        System.out.println(Arrays.toString(generateArray));
        Arrays.sort(generateArray);
        System.out.println(Arrays.toString(generateArray));
        int [] sortedArray = new int[generateArray.length];
        for(int i = 0 ; i < generateArray.length ; i++){
            sortedArray[i] = generateArray[generateArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(sortedArray));

    }
    private static int[] getRandomArray(int len){
        int[] array = new int[len];
        Random random = new Random();
        for(int i = 0 ; i < len ; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
