import java.util.Scanner;
public class n {
    public static void main(String[] args) {
        System.out.println(" This program is only for mathematical calculation  ");
        System.out.println();
        System.out.println("First type username and password. Then enter 1 for multiply , 2 for devide , 3 for fun");
        System.out.print("Enter username  & password :- ");
        Scanner src = new Scanner(System.in);
        char userN= src.next().charAt(0);
        int pass = src.nextInt();
        String  k =  "krish";
        int n = src.nextInt();
        if(userN=='k') 
        {
            // System.out.println("Enter password");
            if(pass==644680575)
            {
                        if(n==1)
                
                            {
                                System.out.println("You can now run the program");
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
                               System.out.println("You can now run the program");
                               System.out.println();
                               System.out.println("Type the two numbers to devide");
                               
                               // Scanner nr = new Scanner(System.in);
                               int ne = src.nextInt();
                               int ne2 = src.nextInt();
                               int ne3 = ne/ne2;
                               System.out.println(ne3);
                               
                               
                            }
                            else if(n==3)
                            {
                               System.out.println("You can now run the program");
                               System.out.println();
                               System.out.println("Type any number");
   
                               // int y3 = 1;
   
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
                System.out.println("Please check th readme file for username and password");
            }

                                                
        }
        else{
            System.out.println("Please check th readme file for username and password");
        }

    
    }
    
}
