// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		String mode = args[0];
	    int seed = Integer.parseInt(args[1]);

	    if (mode.equals("v")) {
		   for (int i = 1; i <= seed; i ++) {
			int current = i;
            int step = 0;
			
			System.out.print(current + " ");
				
				while (current != 1){
	        	   if(current % 2 == 0){
                     System.out.print(current / 2 + " ");
					 current = current / 2;
		        } else{
			         System.out.print(current * 3 + 1 + " ");
					 current = current * 3 + 1;
                }
				step ++;
			    }
		   System.out.println("(" + (step + 1) + ")");
           }
		   System.out.println("Every one of the first " + seed + " hailstone sequences reched 1.");
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
	System.out.println("Every one of the first " + seed + " hailstone sequences reched 1.");
		
 
	   }
	}
}
