package Main;

public class RomConvert {
    public static int  []A = { 1, 4, 5, 9, 10, 40, 50, 90, 100};
    public static String []R = {"I","IV","V","IX","X","XL","L","XC","C"};
    public static String ArabicToRom(int num)
    {
        String result ="";
        for(int i = 0; i < A.length; i++)
        {
            if (num <= A[i] && num !=0)
            {
                if(num - A[i] == 0)
                {
                   result += R[i];
                   break;
                }
                else
                {
                    result += R[i-1];
                    num -= A[i-1];
                    i = 0;
                }
            }

        }

        return result;
    }
    }

