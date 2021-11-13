public class Time {
    
    public static void main(String[] args) {
    
    // time when I started coding
    float hour = 8;                 
    float minute = 27; 
    float second = 48;
    
    // finding elapsed time (in seconds) from midnight
    float secondsElapsed = second + (minute * 60) + (hour * 3600);
    System.out.println("Number of seconds since midnight: " + secondsElapsed);
    
    // finding seconds remaining in the day
    float secondsRemaining = ((60*60*24) - (secondsElapsed));
    System.out.println("Number of seconds remaining in the day: " + secondsRemaining);
    
    // finding percent of day that has passed
    float percentageLeft = ((secondsElapsed / 86400) * 100);
    System.out.println("Percent of the day that has passed: " + percentageLeft + "%");
    
    // time when I finished coding
    float endHour = 10;         
    float endMinute = 28;
    float endSecond = 54;
    
    // finding elapsed time since I started working on exercise
    float elapsedTime = ((endSecond + (endMinute * 60) + (endHour * 3600)) - (secondsElapsed));
    System.out.println("Elapsed time since I started working on this exercise: " + elapsedTime);
    }
}
