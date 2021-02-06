package Main;

public class RomNumber {
    RomNumber(String a, String b)
    {
        char[] chr1 = a.toCharArray();
        char[] chr2 = b.toCharArray();

        for(int i = 0; i < chr1.length; i++)
        {
            if(chr1[i] == 'V' && i != 0)
            {
                ia = 5 - ia;
            }
            else if(chr1[i] == 'X' && i != 0)
            {
                ia = 10 - ia;
            }
            else if(chr1[0] == 'V' && i == 0)
            {
                ia += 5;
            }
            else if(chr1[0] == 'X' && i == 0)
            {
                ia += 10;
            }
            else
            {
                ia += 1;
            }
        }

        for(int i = 0; i < chr2.length; i++)
        {
            if(chr2[i] == 'V' && i != 0)
            {
                ib = 5 - ib;
            }
            else if(chr2[i] == 'X' && i != 0)
            {
                ib = 10 - ib;
            }
            else if(chr2[0] == 'V' && i == 0)
            {
                ib += 5;
            }
            else if(chr2[0] == 'X' && i == 0)
            {
                ib += 10;
            }
            else
            {
                ib += 1;
            }
        }
    }

    private int ia = 0;
    private int ib = 0;

    public int getIa()
    {
        return ia;
    }

    public int getIb()
    {
        return ib;
    }


}
