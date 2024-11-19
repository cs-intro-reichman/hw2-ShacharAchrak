// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int terms = Integer.parseInt(args[0]);
		double piApproximation = 0;
       
		for (int i = 0; i < terms; i++) {
            double term = Math.pow(-1, i) / (2 * i + 1); 
            piApproximation += term;
        }

        piApproximation *= 4;

System.out.println("pi according to Java: " + Math.PI);
System.out.println("pi, approximated: " + piApproximation);

	}
}
