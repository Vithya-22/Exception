package exceptionex;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[7]=20/0;
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		
		System.out.println("rest of the code....");
		
		}

}
