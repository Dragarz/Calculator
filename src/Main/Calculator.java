package Main;

public class Calculator {

    Calculator(String str, int a, int b)
    {
        call(str, a,b);
    }

    Calculator(String str, String a, String b)
    {
       RomNumber rim = new RomNumber(a,b);
       call(str, rim.getIa(), rim.getIb());
       RomConvert conv = new RomConvert();
       res = conv.ArabicToRom(result);
    }
    private int result;
    private String res;

    public int getResult() {
        return result;
    }

    public String getRes()
    {
        return res;
    }

    private void call(String str, int a, int b)
    {
        switch(str) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
        }
    }
}
