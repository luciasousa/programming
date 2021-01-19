// This program should use the generic mergeSort method in p2utils.Sorting
// to sort its string arguments.
import static java.lang.System.*;
import java.util.Scanner;
import java.util.Arrays;
import static p2utils.Sorting.*;  // import sorting methods

public class TestGenericSort {

  static final Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    // Read integers from input into an array:
    String[] array = read(input);

    // Sort the first n elements in the array with our algorithm:
    mergeSort(array, 0, array.length);
    
    // Print the result:
    out.println(Arrays.toString(array));
  }

  static final int BLOCK = 1024;

  // Read integers from the input scanner.
  // Returns the integers in an array.
  public static String[] read(Scanner input) {
    String[] array = new String[0];
    int n = 0;
    while (input.hasNext()) {
      String coisa = input.nextLine();
      if (n == array.length) // if array full, enlarge it
        array = Arrays.copyOf(array, array.length+BLOCK);
      // store each integer in the next available position:
      array[n] = coisa;
      n++;
    }
    array = Arrays.copyOf(array, n);  // readjust length to match n
    return array;
  }

}
