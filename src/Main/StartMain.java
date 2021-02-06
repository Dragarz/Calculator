package Main;

import java.util.Scanner;
import java.lang.String;
public class StartMain {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String str, sa, sb;
      int a, b;
      /*
      Пример правильного ввода 1 + 1, требуется при неверном вводе типа 1+1 завершать программу.
      в первом условии идет проверка на тип первого символа если он типа int он идёт по пути вычисления с арабскими числами, во втором случае с римскими.
      как осуществить проверку такого ввода чтобы вызвать исключение?
             */
      try {

          if (sc.hasNextInt())
          {
              a = sc.nextInt();
              str = sc.next();
              b = sc.nextInt();
              Calculator cal = new Calculator(str, a, b);
              System.out.println(cal.getResult());
          }

          else
              {
              sa = sc.next();
              str = sc.next();
              if(sc.hasNextInt()) throw new IllegalArgumentException();
              sb = sc.next();
              Calculator cal = new Calculator(str, sa, sb);
              System.out.println(cal.getRes());
              }

      }

      catch (Exception e)
      {
          System.exit(0);
      }
    }
}
