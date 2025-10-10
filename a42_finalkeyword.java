//FINAL applies to - variable, method, class


// final class Calc
// {
// 	public void show()
// 	{
// 		System.out.println("Vansh");
// 	}
// 	public void add(int a, int b)
// 	{
// 		System.out.println(a+b);
// 	}
// }


class Calc
{
	//public final void show()
    public void show()
	{
		System.out.println("Vansh");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}


class AdvCalc extends Calc
{
	public void show()
	{
		System.out.println("By Vansh");
	
}}

public class a42_finalkeyword {
    public static void main(String[] args) {
        final int num = 4;
        //num = 5;
        System.out.println(num);


        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);

        AdvCalc obj1 = new AdvCalc();
        obj1.show();
        obj.add(4, 3);
    
    }
}
