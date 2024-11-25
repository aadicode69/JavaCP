package Methods;
import java.util.Arrays;

public class PermutationArray {
    public static void generatePermutations(int[] array, int startIndex) {
        if (startIndex == array.length - 1) {
            System.out.println(Arrays.toString(array));
            return;
        }for (int i = startIndex; i < array.length; i++) {
            swap(array, startIndex, i);

            generatePermutations(array, startIndex + 1);

            swap(array, startIndex, i);
        }
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        generatePermutations(array, 0);
    }
}
