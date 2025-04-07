import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
      int[] object = new int[10]; // using new operator
      object[5] = 20;
      object[2] = 8;
      System.out.println(object[5]);
      double[] doublearray = new double[10];
      doublearray[2] = 3.5;
      System.out.println(doublearray[2]);
      int[] obj2 = new int[] {1,2,3,4,5}; //array intializer
      int[] obj3 = {5,4,3,2,1};
      System.out.println(obj3.length);

      int[] newArray = new int[5];
      for(int i = 0 ; i < newArray.length ; i++){
          newArray[i] = newArray.length -i;
      }
      for (int array:newArray){
          System.out.print(array);
      }
        System.out.println(Arrays.toString(newArray));

      Object obj = newArray;
      if(obj instanceof int[]){
          System.out.println("Integer");
      }
      Object[] obj4 = new Object[3];
      obj4[1]= "EHllo";
      obj4[0] = 20;
      obj4[2] = newArray;



    }



}
