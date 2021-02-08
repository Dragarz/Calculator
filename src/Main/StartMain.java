package Main;

import java.util.Scanner;
import java.lang.String;
import java.util.regex.Matcher;
public class StartMain {
    public static void main(String[] args)
    {
      Scanner sv = new Scanner(System.in);
      String str, sa, sb,check;
      boolean x, y;
      int a, b;
      check = sv.nextLine();
      x = check.matches("\\d{1,2}\\s\\D\\s\\d{1,2}");
      y = check.matches("\\D{1,4}\\s\\D\\s\\D{1,4}");
      if(x || y)
      {


          Scanner sc = new Scanner(check);
          try {

              if (sc.hasNextInt())
              {
                  a = sc.nextInt();
                  str = sc.next();
                  b = sc.nextInt();
                  Calculator cal = new Calculator(str, a, b);
                  System.out.println(cal.getResult());
              } else {
                  sa = sc.next();
                  str = sc.next();
                  if (sc.hasNextInt()) throw new IllegalArgumentException();
                  sb = sc.next();
                  Calculator cal = new Calculator(str, sa, sb);
                  System.out.println(cal.getRes());
              }

          } catch (Exception e)
          {
              System.exit(0);
          }
      }
    }
}
