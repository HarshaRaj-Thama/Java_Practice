public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int test = calculateHighScorePosition(1500);
        displayHighScorePosition("harsha", test);
        test = calculateHighScorePosition(500);
        displayHighScorePosition("harsha", test);
        test = calculateHighScorePosition(100);
        displayHighScorePosition("harsha", test);
        test = calculateHighScorePosition(25);
        displayHighScorePosition("harsha", test);

    }
    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000) return 1;
        else if (playerScore >= 500) return 2;
        else if (playerScore >=100 ) return 3;
        return 4;
    }
}
