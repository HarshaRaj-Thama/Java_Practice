import java.util.Arrays;
import java.util.List;

//2 In a given list, add two or three numbers, and by adding them, we need to get a target of 8?
public class SumofTwoOrThree {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        for(int i =0 ; i < list1.size() ; i++){
            for (int j = i+1; j < list1.size(); j++){
                if((list1.get(i) + list1.get(j)) == 8){
                    System.out.println(list1.get(i)+ " " +list1.get(j));
                }
            }
        }

        for (int i = 0 ; i < list1.size() ; i++){
            for (int j = i+1 ; j < list1.size(); j++){
                for (int k = j+1; k < list1.size() ; k++){
                    if(list1.get(i) + list1.get(j) + list1.get(k) == 8){
                        System.out.println(list1.get(i)+ " " +list1.get(j) + " " + list1.get(k));
                    }

                }
            }
        }




    }
}