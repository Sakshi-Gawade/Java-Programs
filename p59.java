import java.util.Arrays;

class CricketPlayer {
    private String name;
    private int noOfInnings;
    private int noOfTimesNotOut;
    private int totalRuns;
    private double batAvg;

    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = calculateBattingAverage();
    }

    public double calculateBattingAverage() {
        if (noOfInnings == 0) {
            return 0.0;
        }
        return (double) totalRuns / (noOfInnings - noOfTimesNotOut);
    }

    public String getName() {
        return name;
    }

    public double getBatAvg() {
        return batAvg;
    }

    public static void avg(CricketPlayer[] players) {
        for (CricketPlayer player : players) {
            player.batAvg = player.calculateBattingAverage();
        }
    }

    public static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (a, b) -> Double.compare(b.getBatAvg(), a.getBatAvg()));
    }

    public static void displayPlayers(CricketPlayer[] players) {
        for (CricketPlayer player : players) {
            System.out.println("Name: " + player.getName() + ", Average: " + player.getBatAvg());
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of players
        CricketPlayer[] players = new CricketPlayer[n];
        players[0] = new CricketPlayer("Player1", 50, 10, 2000);
        players[1] = new CricketPlayer("Player2", 45, 5, 2200);
        players[2] = new CricketPlayer("Player3", 60, 15, 3000);
        players[3] = new CricketPlayer("Player4", 35, 2, 1500);
        players[4] = new CricketPlayer("Player5", 70, 20, 4000);

        CricketPlayer.avg(players);
        CricketPlayer.sort(players);
        CricketPlayer.displayPlayers(players);
    }
}
