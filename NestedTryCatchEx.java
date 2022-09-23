package exceptionex;

public class NestedTryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			try {
				
				String s=null;
				System.out.println(s.length());
				
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
			
			try {
				String str="abc";
				System.out.println(Integer.parseInt(str));
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
			}
			System.out.println("some other stmts....");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code.......");

	}

}
