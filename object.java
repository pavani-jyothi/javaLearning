class caluclator
 {
     int a;

     public int sub(int n1, int n2)
    {
  
        
         
        int r = n1-n2;
        return r;
    }
}

public class object
{
    public static void main(String[] args) 
    {
    int num1=44;
    int num2=76;

    caluclator calc = new caluclator();
    int result = calc.sub(num1, num2);

        System.out.println(result);
    }
}