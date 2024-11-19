// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];

	    if (mode.equals("v")) {
		   for (int i = 1; i <= seed; i ++) {
			int current = i;
            int step = 0;
			
			System.out.print(current + " ");
				
				while (current != 1){
	        	   if(current % 2 == 0){
					current = current / 2;
				} else{
					 current = current * 3 + 1;
				}
				System.out.print(current + " ");
				step ++;
			    }
				
		   System.out.println("(" + (step + 1) + ")");
           }

		   System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
    	}

	if (mode.equals("c")) {
		for (int i = 1; i <= seed; i ++) {
			int current =i;
			while (current != 1){
	        	if(current %2 == 0){
					current = current / 2;
		        } else{
					current = current * 3 + 1;
                }
		    }
		}
	System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		
 
	   }
	}
}
