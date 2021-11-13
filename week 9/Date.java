public class Date {
	
    private int year;
    private int month;
    private int day;
    
    public Date() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }
    
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    } 
    
    public String toString() {
        return year + "/" + month + "/" + day;
    }
    
    public static void main(String[] args) {
        Date birthday = new Date(2004, 2, 21);
        System.out.println(birthday.toString());
    }
}

