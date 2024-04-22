public class GFG { 
    public static void main(String args[]) 
    { 
        System.out.println("Hello World"); 
        GFG ob = new GFG();
        int res = ob.sum(28, 49);
        int res = ob.subract(28, 49);
        System.out.println(res);
    } 
}

class GFG {
    public static int sum(int num1, int num2)
    {
        return num1+num2;
        
    }

    public static int subtract(int num1, int num2)
    {
        return num1-num2;
        
    }
}