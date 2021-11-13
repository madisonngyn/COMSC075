public class Student {
    
    private String name;
    private int age;
    private double GPA;
    private String phone;
    
    public Student() {
        this.name = "Madison";
        this.age = 17;
        this.GPA = 4.0;
        this.phone = "000-000-0000";
    }
    
    public Student (String name, int age, double GPA, String phone) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
        this.phone = phone;
    }
    
    public void printStatus() {
        System.out.println(name + "," + " age " + age + ", " + "GPA " + GPA + "," + " phone = " + phone);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("Johnny", 30, 3.14, "123-111-2222");
        s1.printStatus();
        
        Student s2 = new Student("Jill", 22, 3.42, "122-129-0000");
        s2.printStatus();
    }
}

