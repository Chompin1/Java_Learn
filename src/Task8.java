import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String result = "guest";
        Scanner scanner = new Scanner(System.in);
        String readInput = scanner.nextLine();
        if(readInput.equals("default")){
            System.out.println(result);
        } else {
            int role = Integer.parseInt(readInput);
            switch (role) {
                case 1:
                    result = "admin";
                    break;
                case 2:
                    result = "moderator";
                    break;
                case 3:
                    result = "user";
                    break;
                default:
                    result = "guest";
                    break;
            }
            System.out.println(result);
        }
    }
}