interface Exam
{
	public boolean pass(int mark);
}

interface Classify
{
	public String division (int average);
}

class Result implements Exam, Classify
{
	public boolean pass(int mark)
	{
		return(mark>=50);		
	}
	public String division (int average)
	{
		String d="undefine";
		if(average>=60)
			d="First";
		else if(average>=50)
			d="Second";
		else
			d="No division";
		
		return(d);
	}
}

class Ex24
{
	public static void main(String args[])
	{
		Result r= new Result();
		System.out.println("Result   : "+r.pass(60));
		System.out.println("Division : "+r.division(50));
	}
}