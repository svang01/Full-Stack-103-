package Day2;

public class Casting {
    public static void main(String[] args) {
        double num = 112.35;
        int data = (int)num;

        System.out.println("Double: " + num);
        System.out.println("int: " + data);

        String value = "49";
        int number = Integer.parseInt(value);

        System.out.println("The string value is: " + value);
        System.out.println("The integer value is: " + number);
    }
}
