package operators;

public class Operators {

	public static void main(String[] args) {
		int result=1+10;
		System.out.println(result);
		int prevresult=result;
		result=result-1;		
		System.out.println(result%3);
		System.out.println(result/3);
		System.out.println(result+3);
		System.out.println(result-3);
		
		if(true||false)
		{
			System.out.println("OR");
		}
		if(true&&false)
		{
			System.out.println("AND");
		}
		boolean ter=true?false:true;
		double a=20d,b=80d,mul=(a+b)*25;
		int rem=(int)mul%40;
		if(rem<=20)
		{
			System.out.println("Total was over the Limit");
		}
		
		
		
	}

}