import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        int x1, x2, x3;
        String result;
        int[] inputValues = readInput();
        x1 = inputValues[0];
        x2 = inputValues[1];
        x3 = inputValues[2];
        var numbers = new ArrayList<>(List.of(x1, x2, x3));
        Collections.sort(numbers);
        String lowest_number = "минимальное: " + numbers.get(0);
        String largest_number = "максимальное: " + numbers.get(2);
        result = lowest_number + ", " + largest_number;
        System.out.println(result);
    }

    public static int[] readInput() {
        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = Integer.parseInt(values[i]);
            }
        }
        scanner.close();

        return inputValues;
    }
}