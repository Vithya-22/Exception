package exceptionex;

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1: where exception doesn't occur...");
		try
		{
			String s="Finally demo";
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(" case 1:It is always executed");
		}
		System.out.println("Rest of the code ....");
		System.out.println("\n case 2: where exception occurs and can be handled...");
		

	}

}
