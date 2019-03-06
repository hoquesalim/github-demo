package OOPConcepts;

public class Functionjava {


	public static void main(String[] args) {
		
		Functionjava obj= new Functionjava();
		 obj.test();
		 int l = obj.abc();
		 System.out.println(l);
	String s1= obj.qa();
	System.out.println(s1);
	
	int div = obj.division(30, 10);
	 System.out.println(div);
		 
	}
		

		public void test(){
			System.out.println("test method");
	}
	  public int abc(){
		  System.out.println("abc method");
		  int a = 10;
		  int b = 20 ;
		  int c = a+ b;
		  return c;
				  
	  }
	   public String qa (){
		   
		    System.out.println("qa method");
		     String s = "Selenium";
		     return s;
		    
		  
		   
	   }
	   public int  division (int x, int y)
	   {
		   System.out.println("Division Method");
		   int d= x/y;
		   return d;
		   
	   }

	}


