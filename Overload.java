
class Adder
{
    public int sum2(int a, int b)
    {
        return a+b;          
    }
   
    public int sum3(int a, int b, int c)
    {
        return a+b+c;          
    }
   
    public int sum4(int a, int b, int c, int d)
    {
        return a+b+c+d;          
    }
}

class Adder2  //Overload
{
    public int sum(int a, int b)
    {
        return a+b;          
    }
   
    public int sum(int a, int b, int c)
    {
        return a+b+c;          
    }
   
    public int sum(int a, int b, int c, int d)
    {
        return a+b+c+d;          
    }
}

class Ex04_Overload
{
    public static void main(String[] args)
    {
        Adder obj = new Adder();
        System.out.println(obj.sum2(10,20));
        System.out.println(obj.sum3(10,20,30));
        System.out.println(obj.sum4(10,20,30,40));
        System.out.println("=====");
        
        //Overload
        Adder2 obj2 = new Adder2();
        System.out.println(obj2.sum(10,20));
        System.out.println(obj2.sum(10,20,30));
        System.out.println(obj2.sum(10,20,30,40));
    }
}