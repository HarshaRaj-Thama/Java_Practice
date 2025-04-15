//3 In a given list add two or three number and by adding it we need to get target 8, print it indexs?
import java.util.Arrays;
import java.util.List;

public class SumOFTwoOrThreeIndexes {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        for(int i =0 ; i < list1.size() ; i++){
            for (int j = i+1; j < list1.size(); j++){
                if((list1.get(i) + list1.get(j)) == 8){
                    System.out.println(i+ " " +j);
                }
            }
        }

        for (int i = 0 ; i < list1.size() ; i++){
            for (int j = i+1 ; j < list1.size(); j++){
                for (int k = j+1; k < list1.size() ; k++){
                    if(list1.get(i) + list1.get(j) + list1.get(k) == 8){
                        System.out.println(i+ " " +j + " " +k);

                    }

                }
            }
        }




    }
}
