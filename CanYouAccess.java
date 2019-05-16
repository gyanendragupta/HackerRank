import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

class CanYouAccess {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            o  = new Inner().new Private ();            
            Method m  =  o.getClass().getDeclaredMethod("powerof2", int.class);
            m.setAccessible(true);
            m.invoke(o, num);
            
		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		}//end of try
		
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
			e.printStackTrace();
		}
	}//end of main
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}
