// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int times = Integer.parseInt(args[1]);

               for (int i = 0; i < name.length(); i++) {
                   System.out.print("Give me ");
                  char c =name.charAt(i);
                   if(c == 'A' || c == 'E'|| c == 'F' || c == 'H' || c == 'I' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'R' || c == 'S' || c == 'X'){
                        
                        System.out.print("an ");
                
                
                } else {
                                System.out.print(" a ");
                        }
                        
                        System.out.println(name.charAt(i) + ": " +name.charAt(i) +"!");
                }
               System.out.println("What does that spell?");
               
               for(int j=0; j<times; j++){
                    System.out.println(name + "!!!");
                   }
               
        }
}
