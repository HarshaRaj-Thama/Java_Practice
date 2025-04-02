public class SecondsAndMinute {
    public static void main(String[] args) {
        System.out.print(getDurationString(3600));
    }
    public static String getDurationString(int seconds){
        return getDurationString(seconds / 60,seconds);
    }
    public static String getDurationString(int minutes,int seconds){
       int hour =  minutes / 60;
       int reaminingminutes = minutes % 60;
       int reaminigseconds = seconds % 60;
       return hour + "h "+reaminingminutes + "m " + reaminigseconds + "s";
    }

    }
