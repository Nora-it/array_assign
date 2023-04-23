import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var numbers = new int[5];

        numbers[0] = 7;
        numbers[1] = 3;
        numbers[2] = 27;
        numbers[3] = 58;
        numbers[4] = 22;
        System.out.println("Original");
        for (int x = 0; x < numbers.length; x++) {
            System.out.println(numbers[x]);
        }
        System.out.println("Alles mal 2");
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = numbers[x] * 2;

        }

        for (int x = 0; x < numbers.length; x++) {
            System.out.println(numbers[x]);
        }
        System.out.println("Jedes 2 mal 3");
        for (int x = 0; x < numbers.length; x += 2) {
            numbers[x] = numbers[x] * 3;
        }
        for (int x = 0; x < numbers.length; x++) {
            System.out.println(numbers[x]);
        }
        var scanner = new java.util.Scanner(System.in);
        boolean found = false;
        do {
            System.out.println("Geben sie eine Zahl ein: ");
            int eingabe = scanner.nextInt();

            for (int x = 0; x < numbers.length; x++) {
                if (numbers[x] == eingabe) {
                    System.out.println("Eingabe ist Vorhanden!");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Eingabe ist nicht Vorhanden!");
            }
        }while (!found);
        String[] letters = {"Abc", "bcd", "cde", "def"};
    }
}