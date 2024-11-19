public class TimeCalc {
    public static void main(String[] args) {
        String correntTime = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = Integer.parseInt(correntTime.substring(0, 2));
        totalMinutes = totalMinutes*60; 
        totalMinutes = totalMinutes + Integer.parseInt(correntTime.substring(3,5));

        totalMinutes += minutesToAdd;
       
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        if (newHours < 10) {
             System.out.print("0"+ newHours);
         } 
 
        if (newHours >= 10){
			System.out.print(newHours);
	 	}	
		 		
	 	if (newMinutes < 10) {
            System.out.print(":0"+ newMinutes);
	 	} 

		if (newMinutes >= 10){
		   System.out.print(":"+ newMinutes);
		 }	
    }
}
