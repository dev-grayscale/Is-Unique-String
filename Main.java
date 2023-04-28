import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique ASCII characters.
 * Uppercase and lowercase characters are treated as different.
 */
public class Main {

  /**
   * Let's start with a brute force solution and optimize from there.
   *
   * Starting the iteration from left to right, check if each character we visit exists among the rest of the characters.
   * <b>If yes -> false (not unique)</b>
   * <b>If no -> proceed with the next item until all are visited</b>
   *
   * If the input is null or blank -> invalid input
   *
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static boolean isUniqueV1(String input) {
    if (input == null || input.isBlank()) {
      throw new IllegalArgumentException("Invalid input");
    }

    // Traverse all characters but the last one
    for (int i = 0; i < input.length() - 1; i++) {
      // For each char on the index i, traverse all other characters
      // in front of it and check for duplicity
      for (int j = i + 1; j < input.length(); j++) {
        if (input.charAt(i) == input.charAt(j)) {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * An improvement for V1 both in performance and length of code using set.
   *
   * This version is quite optimal but takes more memory because of HashSet overhead and casting
   * every character to its wrapper class.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n) - due to being not fixed like in V3,V4
   */
  public static boolean isUniqueV2(String input) {
    if (input == null || input.isBlank()) {
      throw new IllegalArgumentException("Invalid input");
    }

    Set<Character> characterSet = new HashSet<>(input.length());

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (characterSet.contains(ch)) {
        return false;
      }

      characterSet.add(ch);
    }

    return true;
  }

  /**
   * To decrease the runtime from O(n^2) in V1 to O(n), we could map the characters to their occurrences count
   * and check if all equals 1.
   *
   * Instead of using Map, we could enumerate them using array
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1) - always array with 128 slots
   */
  public static boolean isUniqueV3(String input) {
    if (input == null || input.isBlank()) {
      throw new IllegalArgumentException("Invalid input");
    }

    // not using extended ASCII
    int[] charsCount = new int[128];

    for (int i = 0; i < input.length(); i++) {
      // increment the value for the numeric representation of the character
      charsCount[input.charAt(i)]++;
    }

    // if any character's count > 1 -> not unique
    for (int i = 0; i < charsCount.length; i++) {
      if (charsCount[i] > 1) {
        return false;
      }
    }

    return true;
  }

  /**
   * To optimize V3 further, we could get rid of the second loop by using bool[] instead by simply checking
   * if it already exists before being added.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static boolean isUniqueV4(String input) {
    if (input == null || input.isBlank()) {
      throw new IllegalArgumentException("Invalid input");
    }

    // not using extended ASCII
    boolean[] charsMap = new boolean[128];

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (charsMap[ch]) {
        return false;
      }

      charsMap[ch] = true;
    }

    return true;
  }

  /**
   * If the input uses only lowercase letters [a-z] or uppercase ones [A-Z] we could've come up with much more optimal solution for memory,
   * that uses a bit vector (int only). The solution is for lowercase.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static boolean isUniqueV5(String input) {
    if (input == null || input.isBlank()) {
      throw new IllegalArgumentException("Invalid input");
    }

    int verification = 0;

    for (int i = 0; i < input.length(); i++) {
      int charPos = input.charAt(i) - 'a';

      if ((verification & (1 << charPos)) == 1) {
        return false;
      }

      verification |= (1 << charPos);
    }

    return true;
  }
}
