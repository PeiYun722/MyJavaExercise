
class Adder
{
    public static int sum_Class(int n) //類別方法
    {
        int total = 0;         
        for(int i=1; i<=n; i++)
        {
            total += i;
        }   
        return total;          
    }
   
    public int sum_Object(int n) //物件方法
    {
        int total = 0;         
        for(int i=1; i<=n; i++)
        {
            total += i;
        }   
        return total;          
    }
}

class Ex02_Method
{
	public static void main(String[] args)
	{
        //叫用類別方法
        System.out.println("1+2+3+...+100 = " + Adder.sum_Class(100));

		//叫用物件方法
	    Adder obj = new Adder();	           
        System.out.println("1+2+3+...+100 = " + obj.sum_Object(100));	
	}
}