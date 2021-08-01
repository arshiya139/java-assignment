import java.util.*;

class fc
{
	int market;
	ArrayList<String> fruits=new ArrayList<>();
	String fr[]= new String[]{"apple","orange","grape","watermelon"};
	fc(int market)
	{
		this.market=market;
	}	

	synchronized public void farmers()
	{
		
		int i=0;
		
		while(true)
		{
			if(i==4)
			{
				i=0;
			}
			if(fruits.size()==0)
			{
				System.out.println("*****Farmer filling the market...");
			}
			try
			{
				while(fruits.size()==market)
						wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			fruits.add(fr[i]);
			System.out.println(fr[i]+" added to the market.");
			i++;
			notify();
			try
			{
				
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
				
			
		}
	}
		
	synchronized public void customers()
	{
		
		while(true)
		{
			
			
				try
				{
					while(fruits.size()==0)
							wait();
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
				String f=fruits.remove(0);
				System.out.println("Consumed by the Customer: "+f);
				notify();
				try
				{
					
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			
		}
	}
	
}
public class A2 {

	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the market: ");
		int x=sc.nextInt();
		fc n= new fc(x);
        sc.close();
		
		Thread t1= new Thread(new Runnable()
		{
			public void run()
			{
				
				n.farmers();
				
			}
			
		});
		
		Thread t2= new Thread(new Runnable()
		{
			public void run()
			{
				
				
				n.customers();
				
			}
			
		});
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
			
				
		try 
		{
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}