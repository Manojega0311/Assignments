//wrp to demo disply first 10 odd numbers
//Manovadhana M CG BATCH 2576
public class OddNumbers
{
	public static void main(String[]args)
	{
		int Number = 10;
		System.out.println("List of odd numbers from 1 to " +Number+ " :");
		for(int i = 1;i<=Number;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+"");
			}
		}	
	}
}