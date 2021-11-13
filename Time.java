class Time {
    public static void main(String[] args) {
    float hour = 8;                 // time when I started coding
    float minute = 27; 
    float second = 48;
    
    System.out.print("Number of seconds since midnight: ");
    float secondsElapsed = second + (minute * 60) + (hour * 3600);
    System.out.println(secondsElapsed);
    
    System.out.print("Number of seconds remaining in the day: ");
    float secondsRemaining = ((60*60*24) - (secondsElapsed));
    System.out.println(secondsRemaining);
    
    System.out.print("Percent of the day that has passed: ");
    float percentageLeft = ((secondsElapsed / 86400) * 100);
    System.out.print(percentageLeft);
     System.out.println("%");
   
    
    float endHour = 10;              // time when I finished coding
    float endMinute = 28;
    float endSecond = 54;
    
    System.out.print("Elapsed time since I started working on this exercise: ");
    
    float elapsedTime = ((endSecond + (endMinute * 60) + (endHour * 3600)) - (secondsElapsed));
    System.out.println(elapsedTime);
    }
}
