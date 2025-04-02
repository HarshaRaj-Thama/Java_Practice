public class demo {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        {
            int reaminder = kiloBytes % 1024;
            int actual = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + actual + " MB " + reaminder + " KB");
        }
    }


}
