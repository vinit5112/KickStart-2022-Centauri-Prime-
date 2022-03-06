
import java.util.*;

public class Centauri_Prime_code {

  private static String getRuler(String kingdom) {
    
    String ruler = "Bob";
    int r= kingdom.length()-1;
    char[] list = kingdom.toCharArray();
    char[] vow = {'A','I','E','O','U','a','e','i','o','u'};
    for (char c : vow) {
        // list[r] = c; 
        if (list[r] == c) {
            ruler = "Alice";
        }
        else if(list[r]=='y' || list[r] == 'Y'){ 
            ruler = "nobody";
        }
           
    }

    return ruler;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    }
  }
}