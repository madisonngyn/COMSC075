public class lab2 {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);

        String operation = args[1];

        if(args.length == 3) {

        }

        if(operation.equalsIgnoreCase("plus")) {
            System.out.println(num1 + num2);
        }
        else if(operation.equalsIgnoreCase("minus")) {
                System.out.println(num1 - num2);
        }
        else if(operation.equalsIgnoreCase("times")) {
            System.out.println(num1 * num2);
        }
        else if(operation.equalsIgnoreCase("div")) {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println("Unknown operation " + operation);
        }
    }
}
