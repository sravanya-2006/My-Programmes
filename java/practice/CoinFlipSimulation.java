package practice;

public class CoinFlipSimulation {
    public static void main(String[] args) {
        int totalFlips = 15000;
        int headsCount = 0;
        int tailsCount = 0;

        // Simulate coin flipping
        for (int i = 0; i < totalFlips; i++) {
            double flip = Math.random();
            if (flip < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        // Calculate probabilities
        double headsProbability = (double) headsCount / totalFlips;
        double tailsProbability = (double) tailsCount / totalFlips;

        // Print results
        System.out.println("Total Flips: " + totalFlips);
        System.out.println("Heads Count: " + headsCount);
        System.out.println("Tails Count: " + tailsCount);
        System.out.printf("Probability of Heads: %.4f\n", headsProbability);
        System.out.printf("Probability of Tails: %.4f\n", tailsProbability);
    }
}

