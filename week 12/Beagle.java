
class Dog {  
   int age = 5;
   String name = "Bambi";
   String owner = "Madison";
   String breed = "Beagle";
}

class Beagle extends Dog {  
 String tricolor = "No";  
 
 public static void main(String args[]) {  
   Beagle attributes = new Beagle(); 
   
   System.out.println("Beagle's age: " + attributes.age);
   System.out.println("Beagle's name: " + attributes.name);
   System.out.println("Beagle's owner: " + attributes.owner);
   System.out.println("Beagle's breed: " + attributes.breed);
   System.out.println("Is the beagle tricolor?: " + attributes.tricolor);
}  
}  

