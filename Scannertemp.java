import java.util.Scanner;

public class Scannertemp {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        double sum = 0;
        double avg = 0;
        int count = 0;
        while(true){
            try{
                Scanner Scanner = new Scanner(System.in);
                String number = Scanner.nextLine();
                double num = Double.parseDouble(number);
                sum += num;
                count ++;
                avg = (long)Math.round( sum / count);
            }
            catch (NumberFormatException e){
                break;
            }
        }
        System.out.println("SUM = "+ sum + " AVG = "+ avg);
    }
}


