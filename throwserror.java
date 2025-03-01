public class throwserror {
		public static void main(String[]args) throws Exception{
			int n = 5;   
	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");}
	            
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	                Thread.sleep(500);
	            }
	            System.out.println();
	            
	        }

	        
	        for (int i = n - 1; i >= 1; i--) {
	            
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            } 
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	                Thread.sleep(500);
	            }
	            System.out.println();
	            
	        }
			
		}
		
	}