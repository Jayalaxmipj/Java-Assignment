package assignment;

public class First5_value {

	
		
		static void result(int N) 
		{	 
			// iterate from 0 to N 
			for (int num = 0; num < N; num++) 
			{	 
				// Short-circuit operator is used 
				if (num % 3 == 0 && num % 5 == 0 && num % 2 == 0) 
					System.out.print(num + " "); 
			} 
		} 
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 
						int N = 50; 
						
						
						result(N);
		}
		 
			 
		
	}


