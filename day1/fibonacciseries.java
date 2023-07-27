package week1.day1;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//logic to print fibbinocci series 0 to 56//
		
		
		int  firstnum=0;
		int secnum=1,sum=0;
		
		System.out.println("The first number" +  firstnum);
		
		for(int i=1;i<11;i++) 
		{
	
		
		sum=firstnum+secnum;
		
		System.out.println(sum+"");
		firstnum=secnum;
		secnum=sum;
		
		}
	}

}
