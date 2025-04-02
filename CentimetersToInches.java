public class CentimetersToInches {
    public static void main(String[] args) {
        System.out.print(convertToCentimeters(5,8));
    }
    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54 ;
    }
    public static double convertToCentimeters(int heightInFeet,int heightInInches){
        return convertToCentimeters((heightInFeet * 12) + heightInInches);

    }
}
