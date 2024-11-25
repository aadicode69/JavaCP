package Methods;
import java.util.Arrays;
public class StringToArray {
    public static void main(String[] args) {
        String input = "Hello"; // Get input from the user if needed
        char[] letters = input.toCharArray();

        System.out.println(Arrays.toString(letters)); // Output: [H, e, l, l, o]
    }
}
