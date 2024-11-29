import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int score = Integer.parseInt(scanner.nextLine());
        System.out.println(message + " " + (score * 2));
    }
}
