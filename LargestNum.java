//8 Print the largest number [30,40,50,91,33,75,66,88] using Java 8 without the max keyword.
public class LargestNum {
    public static void main(String[] args) {
        int[] arr = {30,40,50,91,33,75,66,88};
        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
