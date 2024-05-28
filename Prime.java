import java.util.Scanner;
class Prime
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)
	{
	  if(n%i==0)
	  {
	    count++;
	  }
	}
	if(count==2)
	  {
	  System.out.println("The Number is Prime: "+n);
	  
	  }
	  else
	  {
	    System.out.println("The number is Not Prime: "+n);
	  }

	 
   }
}
