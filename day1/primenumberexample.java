package week1.day1;

public class primenumberexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//number that is divisible by itself
		
	int num=15;
	int count=0;
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
				count++;
				}
			}
				if(count==0)
				{
					System.out.println(num+ " is a prime");
				}
					else
					{
						System.out.println(num+ " is not prime");
				}
			}
	
	
}



