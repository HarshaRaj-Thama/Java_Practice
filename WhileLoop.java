public class WhileLoop {
    public static void main(String[] args) {
        printSquareStar(5);

    }
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }else {
        for(int i = 1; i <= number ; i++){
            for(int j = 1 ; j <= number ; j++){
                if((i == j) || (j == number - i + 1) || (j == number) || (i==1 || j==1) || (i == number)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }}
}
