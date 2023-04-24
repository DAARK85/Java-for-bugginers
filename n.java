import java.util.Scanner;
public class n {
    public static void main(String[] args) {
        System.out.println(" This program is only for mathematical calculation  ");
        System.out.println();
        System.out.println("First type username and password.");
        System.out.print("Enter username  :- ");
        Scanner src = new Scanner(System.in);
        String userN= src.next();
        
        String  k =  "krish";
        
        if(userN.equals(k) )
        {
            System.out.print("Enter password :- ");
            int pass = src.nextInt();
            if(pass==644680575)
            {
                System.out.println("You can now run the program");
                System.out.println();
                System.out.println("Enter 1 for multiply , 2 for devide , 3 for fun ");
                int n = src.nextInt();
                        if(n==1)
                
                            {
                                
                                System.out.println();
                                System.out.println("Type the numbers to get its multiple");
                                Scanner Src1= new Scanner(System.in);
                                int p = Src1.nextInt();
                              
                                
                                int i = 2;
                                while(i<=10)
                                {
                                    int l = i*p;
                                        System.out.println(l);
                                        i++;
                                }
                            }
                            else if(n==2)
                            {

                               System.out.print("Type the first number : - ");
                               
                               // Scanner nr = new Scanner(System.in);
                               float ne = src.nextInt();
                               System.out.print("Type the second number : - ");
                               float ne2 = src.nextInt();
                               float ne3 = ne/ne2;
                               System.out.print("Answer : - "+ne3);
                               
                               
                            }
                            else if(n==3)
                            {
                               System.out.println("Type any number");   
                               int y2 = src.nextInt();
                               int x=1 ; 
                               while(x<=y2)
                               {
                                   
                                   int y =1 ;
                                   while(y<=x)
                                   {
                                       System.out.print( x+" " );
                                       
                                       y++;
                                   }
                                   System.out.println();
                                   x++;
                               }
   
                            }
            }
            else{
                System.out.println("Please check th readme file for password");
            }

                                                
        }
        else{
            System.out.println("Please check th readme file for username and password");
        }

    
    }
    
}
