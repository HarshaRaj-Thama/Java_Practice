import java.util.Arrays;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
    int[] myarray = getRandomArray(5);
        System.out.println(Arrays.toString(myarray));
        Arrays.sort(myarray);
        System.out.println(Arrays.toString(myarray));

        int [] array2 = new int[10];
        Arrays.fill(array2,5);
        System.out.println(Arrays.toString(array2));

        int[] array3 = getRandomArray(10);
        System.out.println(Arrays.toString(array3));

        int[] array4 = Arrays.copyOf(array3,array3.length);
        Arrays.sort(array4);

        System.out.println(Arrays.toString(array4));


        String[] names = {"harsha","raj","vardhan"};
        Arrays.sort(names);
        if(Arrays.binarySearch(names,"harsha") >= 0){
            System.out.println("found");
        }
        else System.out.println("not found");

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if(Arrays.equals(s1,s2)){
            System.out.println("equal");
        }

        else System.out.println("not equal");




    }
    private  static  int[] getRandomArray(int len){
        Random random = new Random();
        int [] array = new int [len];
        for(int i =0;i < len;i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
