
class ExceptionHandlingDemo {
	static void main(String []args) {
//		File file = new File("file.txt");
//		FileReader fr = new FileReader(file);

		try {
			def arr = new int[3];
			arr[5] = 5;
		 } catch(Exception ex) {
			println("Catching the exception");
		 }
		   
		 println("Let's move on after the exception");
	  
		 try {
			 def arr = new int[3];
			 arr[5] = 5;
		  }catch(ArithmeticException ex) {
			 println("Catching the Array out of Bounds exception");
		  }catch(Exception ex) {
			 println("Catching the exception");
		  }
		
		  finally {
			  println("Finally always executes");
		  }

		  try {
			  def arr = new int[3];
			  arr[5] = 5;
		   }catch(ArrayIndexOutOfBoundsException ex) {
			  println(ex.getMessage())
			  println(ex.toString())
			  println("Catching the Array out of Bounds exception");
			  println(ex.getStackTrace())
		   }catch(Exception ex) {
			  println("Catching the exception");
		   }
		 
		   finally {
			   println("Finally always executes");
		   }
		  
		def arr1 = new int[3];
		println("between");
		arr1[5] = 5;

	}
}
