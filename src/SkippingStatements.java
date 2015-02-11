
public class SkippingStatements 
{

	public static void main(String[] args)
	{
		//show all numbers below 20 which are divisible both by 3 and by 4
	
		for(int i=0; i<20; i++)	
		{
		if(i%3==0 && i%4==0)
		{
		
			System.out.println("The numbers are " + i);
		}
		else if(i%3==0 || i%4==0)
		{
			System.out.println("The numbers are "+ i);
		}
		else if ((i%4)!=0)
		{
			System.out.println("(" + i + ")");
		}
		}
		puttingStar();
	}
		public static void puttingStar()
		{
			for (int j = 0; j<30; j++)
			{
				
		 if (j>15){
			System.out.println(j + "**");
			}
		
		else if (j>10){
			System.out.println(j + "*");
			}
		else 
			{System.out.println(j);}
		}
			
		}
		
	}



