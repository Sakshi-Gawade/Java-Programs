public class p58 {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isAM;

    public p58(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.isAM = true; // Default to AM mode
        } else {
            System.out.println("Invalid time provided.");
        }
    }

    // Check if the provided time is valid
    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60);
    }

    // Set the time to AM or PM mode
    public void setTimeMode(boolean isAM) {
        this.isAM = isAM;
    }

    // Format the time as a string
    public String getTime() {
        String timeMode = isAM ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, timeMode);
    }

    public static void main(String[] args) {
        // Example usage:
        p58 clock = new p58(10, 30, 45);
        clock.setTimeMode(false); // Set to PM mode
        System.out.println("Current Time: " + clock.getTime()); // Output: "Current Time: 10:30:45 PM"
    }
}
