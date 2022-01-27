package practiceproject;	

public class emailid
{
	public static void main(String[] args) 
	{
		String mailid[]={"abc@gmail.com","bcd@gmail.com","cde@gmail.com"}; //defined Array
		String search_el="bcd@gmail.com"; //user input
		boolean flag=false; //user flag
		for(int i=0;i<mailid.length;i++) //using for loop extracting data from given array
		{
			if(search_el==mailid[i]) //applying condition to validate the data from array
			{
				System.out.println("mail id found");
				flag=true; //if data is present in the array changing the flag in true
				break; //condition satisfied then ending the code execution
			}		
		}
		
		if(flag==false)
		{
			System.out.println("mail id not found");
		}
	}
}
