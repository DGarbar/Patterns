import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Proba {

  public static void main(String[] args) {
    //Input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n + 2];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    sc.close();
    Arrays.sort(s, 0, n, (s1, s2) -> {
      BigDecimal d1 = new BigDecimal(s1);
      BigDecimal d2 = new BigDecimal(s2);
      return d2.compareTo(d1);
    });
    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }
}
