import java.util.Random;
import java.util.random.RandomGeneratorFactory;

public class Driver {

  public static Boolean isVowel(String s) {
    String VOWELS = "aeiouAEIOU";
    return VOWELS.indexOf(s.charAt(0)) != -1;
  }

  // Set a String to "abkdoiswekjdies" and call a recursive routine that returns
  // the string in reverse order AND removes vowels(a,e,i,o,u). The answer for
  // this example is sdjkwsdkb. Try some of your own examples (like all vowels or
  // no vowels, or one character), etc.
  public static String reverseAndRemoveVowelsString(String s, int i, int j) {

    // reversal
    // substr before i -- 1
    // substr at i -- 2
    // subst btw i and j -- 3
    // substr at j -- 4
    // substr after j -- 4
    // we want to swap 2 and 4 IF they are not vowels. Otherwise do not add them
    // back, just move the one that's not a vowel to the other slot
    if (i >= j) {
      return s;
    }
    String a = s.substring(0, i - 1);
    String b = s.substring(i - 1, i);
    String c = s.substring(i, j - 1);
    String d = s.substring(j - 1, j);
    String e = s.substring(j, s.length());
    String concat = a;
    if (!isVowel(d)) {
      concat = concat + d;
    } else {
      j--;
      i--;
    }
    concat = concat + c;
    if (!isVowel(b)) {
      concat = concat + b;
    }
    concat = concat + e;
    return (reverseAndRemoveVowelsString(concat, i + 1, j - 1));
  }

  public static int findMin(Integer[] a, int currentMin, int i, int j) {
    if (i >= j) {
      return currentMin;
    }
    if (a[i] < currentMin) {
      currentMin = a[i];
    } else if (a[j] < currentMin) {
      currentMin = a[j];
    }
    i += 1;
    j -= 1;
    return (findMin(a, currentMin, i, j));
  }

  public static String iToS(int n, String s) {
    int c = n % 10;
    n /= 10;
    s = c + s;
    if (n == 0) {
      return s;
    }
    return iToS(n, s);
  }

  public static void main(String[] args) {
    String testString = "abkdoiswekjdies";
    System.out.println("Part 1");
    System.out.println("Reversing and removing vowels from " + testString);
    System.out.println(reverseAndRemoveVowelsString(testString, 1, testString.length()));

    System.out.println("Part 2");
    Integer[] randomArr = new Integer[20];
    Random r = new Random();
    for (int i = 0; i < 20; i++) {
      randomArr[i] = r.nextInt(99) + 1;
    }
    System.out.println("Random array: ");
    for (int i = 0; i < 20; i++) {
      System.out.print(randomArr[i] + ",");
    }
    System.out.println("");
    System.out.println("Minimum: " + findMin(randomArr, 101, 1, randomArr.length
        - 10));
    System.out.println("Part 3");
    System.out.println("Convert int to string: " + 12349);
    System.out.println("Converted: " + iToS(12349, ""));
  }

}
