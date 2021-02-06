package Main;

import java.util.Scanner;
import java.lang.String;
public class StartMain {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str, sa, sb;
      int a, b, result;

      if(sc.hasNextInt())
      {
          a = sc.nextInt();
          str = sc.next();
          b = sc.nextInt();
          Calculator cal = new Calculator(str, a, b);
          System.out.println(cal.getResult());
      }
      else {
          sa = sc.next();
          str = sc.next();
          sb = sc.next();
          Calculator cal = new Calculator(str, sa, sb);
          System.out.println(cal.getRes());
      }
    }
}
