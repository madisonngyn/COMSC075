public class focalLengthOfCamera {
	
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking user for distance from object to lens in meters
        System.out.println("Enter the distance from the object to the lens in meters: "); 
        double distanceToObject = input.nextDouble();
    
        // Asking user for distance from lens to image sensor in centimeters
        System.out.println("Enter the distance from the lens to the image sensor in centimeters: ");
        double distanceToImageSensor = input.nextDouble();
        
        // Converting distances to millimeters
        double dO = (distanceToObject * 1000);
        double dI = (distanceToImageSensor * 10);
        
        // Calculating focal length of camera
        double focalLength = reciprocal(1 / dO + 1 / dI);
        System.out.printf("The focal length is %.2f mm.",focalLength);
    }
    
    public static double reciprocal(double x) {
        return (1.0 / x);
    }
}
