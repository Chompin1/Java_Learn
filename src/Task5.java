import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int num = readInput();
        String result;
        if (num % 2 == 0) {
            result = "четное";
        } else {
            result = "нечетное";
        }
        System.out.println(result);
    }

    public static int readInput() {
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            num = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return num;
    }
}