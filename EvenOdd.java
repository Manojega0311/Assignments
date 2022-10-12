//wrp to demo check whether a number is odd or even
//Manovadhana M CG BATCH 2576
public class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner reader = new scanner(System.in);
		System.out.println("Enter a number:");
		int num = reader.nextInt();
		if(num%2==0)
		System.out.println(num+"is even");
else
	    System.out.println(num+"is odd");
	
	}
}