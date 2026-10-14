import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Інформація про примітивні типи даних
        System.out.println("=== ПРИМІТИВНІ ТИПИ ДАНИХ JAVA ===");

        System.out.println("byte   | розмір: " + Byte.SIZE + " біт | min: " + Byte.MIN_VALUE + " | max: " + Byte.MAX_VALUE);
        System.out.println("short  | розмір: " + Short.SIZE + " біт | min: " + Short.MIN_VALUE + " | max: " + Short.MAX_VALUE);
        System.out.println("int    | розмір: " + Integer.SIZE + " біт | min: " + Integer.MIN_VALUE + " | max: " + Integer.MAX_VALUE);
        System.out.println("long   | розмір: " + Long.SIZE + " біт | min: " + Long.MIN_VALUE + " | max: " + Long.MAX_VALUE);
        System.out.println("float  | розмір: " + Float.SIZE + " біт | min: " + Float.MIN_VALUE + " | max: " + Float.MAX_VALUE);
        System.out.println("double | розмір: " + Double.SIZE + " біт | min: " + Double.MIN_VALUE + " | max: " + Double.MAX_VALUE);
        System.out.println("char   | розмір: " + Character.SIZE + " біт | min: " + (int) Character.MIN_VALUE + " | max: " + (int) Character.MAX_VALUE);
        System.out.println("boolean| розмір: 1 біт | значення: false / true");

        Scanner scanner = new Scanner(System.in);

        // Введення byte
        System.out.print("\nВведіть число типу byte: ");
        String input = scanner.nextLine();
        byte byteValue = Byte.parseByte(input);
        System.out.println("Ви ввели: " + byteValue);

        // Введення short
        System.out.print("Введіть число типу short: ");
        input = scanner.nextLine();
        short shortValue = Short.parseShort(input);
        System.out.println("Ви ввели: " + shortValue);

        // Введення int
        System.out.print("Введіть число типу int: ");
        input = scanner.nextLine();
        int intValue = Integer.parseInt(input);
        System.out.println("Ви ввели: " + intValue);

        // Введення long
        System.out.print("Введіть число типу long: ");
        input = scanner.nextLine();
        long longValue = Long.parseLong(input);
        System.out.println("Ви ввели: " + longValue);

        // Введення float
        System.out.print("Введіть число типу float: ");
        input = scanner.nextLine();
        float floatValue = Float.parseFloat(input);
        System.out.println("Ви ввели: " + floatValue);

        // Введення double
        System.out.print("Введіть число типу double: ");
        input = scanner.nextLine();
        double doubleValue = Double.parseDouble(input);
        System.out.println("Ви ввели: " + doubleValue);

        // Введення char
        System.out.print("Введіть символ типу char: ");
        input = scanner.nextLine();
        char charValue = input.charAt(0);
        System.out.println("Ви ввели: " + charValue);

        // Введення boolean
        System.out.print("Введіть значення true або false: ");
        input = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(input);
        System.out.println("Ви ввели: " + booleanValue);

        scanner.close();

        System.out.println("\n=== Програму завершено ===");
    }
}