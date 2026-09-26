import java.util.Scanner;
public class CalculatorTest 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        Calculator calc = new Calculator();

        //Asks for 2 ints and adds them
        System.out.println("Enter 2 intergers:");
        int int1 = keyboard.nextInt();
        int int2 = keyboard.nextInt();
        int intResult = calc.addInt(int1, int2);
        System.out.println("Adding 2 ints: "+int1+" + "+int2+" = "+intResult);

        //Asks for 3 ints and adds them
        System.out.println("\nEnter 3 intergers:");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();
        int int3Result = calc.add3Int(num1, num2, num3);
        System.out.println("Adding 3 ints: "+num1+" + "+num2+" + "+num3+" = "+int3Result);

        //Asks for 2 doubles and adds them
        System.out.println("\nEnter 2 doubles:");
        double double1 = keyboard.nextDouble();
        double double2 = keyboard.nextDouble();
        double doubleResult = calc.addDouble(double1, double2);
        System.out.println("Adding 2 doubles: "+double1+" + "+double2+" = "+doubleResult);

        //Asks for 2 strings and joins them
        System.out.println("\nEnter 2 strings:");
        String string1 = keyboard.next();
        String string2 = keyboard.next();
        String stringResult = calc.addString(string1, string2);
        System.out.println("Concatenating 2 strings: "+string1+" + "+string2+" = "+stringResult);

        keyboard.close();
    }

}
