import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        int n = readInput();
        boolean result = false;
        if (n%6 == 0){
            result = true;
            System.out.println(result);
        } else

            System.out.println(result);
    }

    public static int readInput() {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return n;
    }
}