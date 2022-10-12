//wrp to demo largest of three numbers
//Manovadhana M CG BATCH 2576
public class LargestNumber
{
	public static void main(String[]args)
	{
		int a = 40,b = 78,c = 17;
		if(a>=b&&a>=c)
		System.out.println(a+ "is the largest number");
        else if(b>=a&&b>=c)
        System.out.println(b+"is the largest number");
        else
        System.out.println(c+"is the largest number");			
	}
}