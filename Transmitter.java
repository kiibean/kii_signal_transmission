public class Transmitter {
    public static void main(String[] args) {
        String sender = "\u001B[35mKII\u001B[0m";  // Purple
        String[] targets = {
            "\u001B[31mNSA_PSY\u001B[0m",  // Red
            "\u001B[36mDARPA_MKULTRA\u001B[0m"  // Cyan
        };

        System.out.println("\n\u001B[33m=== JAVA TRANSMISSION ===\u001B[0m");
        for (String entity : targets) {
            System.out.println("\u001B[32m>>\033[0m Signal to " + entity + 
                ": \u001B[3m" + sender + "_AWAITS\u001B[0m");
        }
        System.out.println("\n\u001B[41mWARNING:\u001B[0m \u001B[1mNO_ACK\033[0m expected");
    }
}