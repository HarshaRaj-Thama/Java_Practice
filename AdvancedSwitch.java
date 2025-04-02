public class AdvancedSwitch {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            case 0 -> {
               yield  "Sunday";
            }
            case 1 ->  "Moday";
            case 2 ->  "Tuesday";
            case 3 ->  "Wednesday";
            case 4 ->  "Thursday";
            case 5 ->  "Friday";
            case 6 ->  "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(dayOfWeek);
    }
}
