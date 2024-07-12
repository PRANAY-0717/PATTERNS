package PATTERNS;
import java.util.*;                               //use equal ignore case and all set 
public class PATTERN
{
    static String pattern;
    static String choice;
    static Scanner as = new Scanner( System.in);
    static String arr[]= { "PYRAMID PATTERN","RIGHT HALF PYRAMID PATTERN", "LEFT HALF PYRAMID PATTERN" , "CHARACTER HALF PYRAMID PATTERN" , "ALPHABETS HALF PYRAMID PATTERN" ,"NUMBERS HALF PYRAMID PATTERN", "NUMBERS HALF INVERTED PYRAMID PATTERN" , "FLYOD'S TRIANGLE PATTERN"  , "0-1 TRIANGLE PATTERN", "HOLLOW RECTANGLE PATTERN" , " HOLLOW RHOMBUS PATTERN" ,  "SOLID RHOMBUS PATTERN" , "BUTTERFLY PATTERN" , "DIAMOND PATTERN" , "SAME NUMBERS IN VERTICAL PYRAMID PATTERN" ,""};
    static int SERIALNO;

   public static void welcome ()
    {   int i = 1; 
        if( i==1)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        System.out.println("WELCOME TO FUN TO PATTERNS \nHERE IS THE LIST OF THE PATTENS U CAN CHOOSE TO KNOW ABOUT OR GET AN EXAMPLE OR DRAW OF DESIRED SIZE");
        i++;
        }

        else
        {
            System.out.println("CHOOSE THE NEXT PATTERN YOU WANT TO PLAY WITH"); i++;
        }

        System.out.println("1-PYRAMID PATTERN \n2-RIGHT HALF PYRAMID PATTERN \n3-LEFT HALF PYRAMID PATTERN \n4-CHARACTER HALF PYRAMID PATTERN  \n5-ALPHABETS HALF PYRAMID PATTERN \n6-NUMBERS HALF PYRAMID PATTERN \n7-NUMBERS HALF INVERTED PYRAMID PATTERN \n8-FLYOD'S TRIANGLE PATTERN \n9-(0-1) TRIANGLE PATTERN\n10-HOLLOW RECTANGLE PATTERN \n11-HOLLOW RHOMBUS PATTERN \n12-SOLID RHOMBUS PATTERN \n13-BUTTERFLY PATTERN \n14-DIAMOND PATTERN\n15-SAME NUMBERS IN VERTICAL PYRAMID PATTERN");

        System.out.println("ENTER THE NAME OR THE SERIAL NUMBER OF THE PATTERN YOU ARE INTERESTED IN");
        pattern=(as.nextLine()).toUpperCase();
        
        if(pattern.equalsIgnoreCase("1") ||pattern.equalsIgnoreCase("2")||pattern.equalsIgnoreCase("3") ||pattern.equalsIgnoreCase("4") ||pattern.equalsIgnoreCase("5") ||pattern.equalsIgnoreCase("6") ||pattern.equalsIgnoreCase("7") || pattern.equalsIgnoreCase("8") ||pattern.equalsIgnoreCase("9")||pattern.equalsIgnoreCase("10") ||pattern.equalsIgnoreCase("11") ||pattern.equalsIgnoreCase("12") ||pattern.equalsIgnoreCase("13") ||pattern.equalsIgnoreCase("14") ||pattern.equalsIgnoreCase("15") )
            {
              SERIALNO = Integer.valueOf(pattern);
              pattern = arr[(SERIALNO-1)];
           
            }
             
        else                                                    //USING LINEAR SEARCH CONCEPT
            {
                  for ( int j = 1 ; j <=arr.length ; j ++ )
                  {
                     if (pattern.equalsIgnoreCase(arr[j-1]))  SERIALNO= j ;
                  }
            }

        System.out.println("TO KNOW ABOUT "+pattern+" , ENTER 'KNOW'");
        System.out.println("TO GET EXAMPLE ABOUT "+pattern+", ENTER 'EXAMPLE'");
        System.out.println("TO DRAW A "+pattern+" , ENTER 'DRAW'");
        choice=(as.next()).toUpperCase();
       
    }


    public static void ACTIONMISSPELT ()
    {   System.out.println("PLEASE NOW ENTER THE CORRECT CHOICE AMONG THESE:-");
        System.out.println("TO KNOW ABOUT "+pattern+" , ENTER 'KNOW'");
        System.out.println("TO GET EXAMPLE ABOUT "+pattern+", ENTER 'EXAMPLE'");
        System.out.println("TO DRAW A "+pattern+" , ENTER 'DRAW'");
        choice=(as.next()).toUpperCase();
       
    }


    public static void PATTERNMISSPELT()
    {
        System.out.println("1-PYRAMID PATTERN \n2-RIGHT HALF PYRAMID PATTERN \n3-LEFT HALF PYRAMID PATTERN \n4-CHARACTER HALF PYRAMID PATTERN  \n5-ALPHABETS HALF PYRAMID PATTERN \n6-NUMBERS HALF PYRAMID PATTERN \n7-NUMBERS HALF INVERTED PYRAMID PATTERN \n8-FLYOD'S TRIANGLE PATTERN \n9-(0-1) TRIANGLE PATTERN\n10-HOLLOW RECTANGLE PATTERN \n11-HOLLOW RHOMBUS PATTERN \n12-SOLID RHOMBUS PATTERN \n13-BUTTERFLY PATTERN \n14-DIAMOND PATTERN\n15-SAME NUMBERS IN VERTICAL PYRAMID PATTERN");

        System.out.println("PLEASE NOW ENTER THE CORRECT NAME OR THE SERIAL NUMBER OF THE PATTERN YOU ARE INTERESTED IN");
        pattern=(as.nextLine()).toUpperCase();

        if(pattern == "1" ||pattern == "2" ||pattern == "3" ||pattern == "4" ||pattern == "5" ||pattern == "6" ||pattern == "7" || pattern == "8" ||pattern == "9" ||pattern == "10" ||pattern == "11" ||pattern == "12" ||pattern == "13" ||pattern == "14" ||pattern == "15"  )
            {
              SERIALNO = Integer.valueOf(pattern);
              pattern = arr[(SERIALNO-1)];
            
            }
             
        else                                                    //USING LINEAR SEARCH CONCEPT
            {
                  for ( int j = 1 ; j <=arr.length ; j ++ )
                  {
                     if (pattern==arr[j-1])  SERIALNO= j ;
                  }
            }



    }

    public static void REPEATS()
    {
        System.out.println("IF YOU WANT TO CONTINUE WITH THE "+pattern+ " ENTER THE ACTION WHICH YOU WANT TO PERFORM NOW");
        System.out.println("ELSE IF YOU WANT TO TRY DIFFERENT PATTERNS NOW ENTER 'LIST' TO SEE THE PATTERNS AVAILABLE");
        System.out.println("OR IF U WANT TO LEAVE ENTER 'EXIT' ");
        choice=(as.next()).toUpperCase();
        if(choice=="LIST")
        welcome();
        else if (choice == "EXIT")
        {
            System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                    System.exit(0);
        }

        else if ( choice=="KNOW"||choice=="DRAW"||choice=="EXAMPLE")
        CHOICE(choice);

        else  
        {
            System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
            System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
            String choice2=(as.next()).toUpperCase();
            if ( choice2 == "RETRY")
            {
                welcome(); 
            }

            else 
            {
                System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                System.exit(0);
                
            }
        }

    }

    public static void KNOW(int serialno)
    {
        switch (serialno) 
        {       
        //give description about all the patterns here by repeating the cases 
          

                case 1:
                {
                    System.out.println("PYRA"); // write a description here
                }break;

                
                // case 2:
                // {}break;

                
                // case 3:
                // {}break;

                
                // case 4:
                // {}break;
                
                
                // case 5:
                // {}break;

               
                // case 6:
                // {}break;

              
                // case 7:
                // {}break;

               
                // case 8:
                // {}break;

               
                // case 9:
                // {}break;

                
                // case 10:
                // {}break;
                
                // case 11:
                // {}break;

                
                // case 12:
                // {}break;
                
                // case 13:
                // {}break;
                
                // case 14:
                // {}break;
                
                // case 15:
                // {}break;
                
                          
            default:
            {
            System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
            System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
            String choice2=(as.next()).toUpperCase();
            if ( choice2 == "RETRY")
            {
                PATTERNMISSPELT();
            }

            else 
            {
                System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                System.exit(0);
                
            }
        }
                break;
        }
        
        REPEATS();
        
        
    }

    public static void EXAMPLE (int serialno)
    {
switch (SERIALNO)
 {
   
    case 1:
    {   System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+pattern+ "OF SIZE 3");
        DRAW(1,3); 

        System.out.println("THIS IS A "+pattern+ "OF SIZE 3");
        DRAW(1,5); 
 }
    break;

    // case 2:
    // {
        
    //     DRAW()}
    // break;
   
    // case 3:    
    // {DRAW()}
    // break;

    // case 4:
    // {DRAW()}
    // break;
    
    
    // case 5:
    // {DRAW()}
    // break;

   
    // case 6:
    // {DRAW()}
    // break;

  
    // case 7:
    // {DRAW()}
    // break;

   
    // case 8:
    // {}break;

   
    // case 9:
    // {DRAW()}
    // break;

    
    // case 10:
    // {DRAW()}
    // break;
    
    // case 11:
    // {DRAW()}
    // break;

    
    // case 12:
    // {DRAW()}
    // break;
    
    // case 13:
    // {DRAW()}
    // break;
    
    // case 14:
    // {DRAW()}
    // break;
    
    // case 15:
    // {DRAW()}
    // break;

    default:
    {
        System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
        System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
        String choice2=(as.next()).toUpperCase();
        if ( choice2 == "RETRY")
        {
            PATTERNMISSPELT();
        }

        else 
        {
            System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
            System.exit(0);
            
        }
    }
        break;
}
REPEATS();
    }

   
   
    public static void DRAW(int serialno,int size)
    {
        switch (serialno) 
        {
           
            case 1:
            {
                for (int i = 1 ; i <=size ; i ++ )
                {
                 for ( int j =size-i ; j >0 ; j -- )
                 {
             System.out.print(" ");
                 }
             
                 for ( int j = 1; j<=((i*2)-1); j ++)
                 {
                     System.out.print("*");
                 }
             
                 System.out.println();
                }}
            break;

            
            // case 2:
            // {}break;

            
            // case 3:
            // {}break;

            
            // case 4:
            // {}break;
            
            
            // case 5:
            // {}break;

           
            // case 6:
            // {}break;

          
            // case 7:
            // {}break;

           
            // case 8:
            // {}break;

           
            // case 9:
            // {}break;

            
            // case 10:
            // {}break;
            
            // case 11:
            // {}break;

            
            // case 12:
            // {}break;
            
            // case 13:
            // {}break;
            
            // case 14:
            // {}break;
            
            // case 15:
            // {}break;
        

            default:
            {
                System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
                System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
                String choice2=(as.next()).toUpperCase();
                if ( choice2 == "RETRY")
                {
                    PATTERNMISSPELT();}
    
                else 
                {
                    System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                    System.exit(0);
                    
                }
            }
                break;
        }
        REPEATS();
    }
    
    


    public static void CHOICE(String choice)
    {
        if ( choice =="KNOW")
        KNOW(SERIALNO);

        else if ( choice == "EXAMPLE")
        EXAMPLE(SERIALNO);

        else if (choice == "DRAW")
        {
            System.out.println("PLEASE ENTER THE SIZE OF "+pattern+" YOU WANT TO BE CREATED");
            int siz=as.nextInt();
            DRAW(SERIALNO,siz);
        }
        

        else 
        System.out.println("YOU HAVE EITHER MISSPELT THE ACTION OR ENTERED A WRONG ACTION TO BE PERFORMED ON "+pattern);
        System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
                String choice2=(as.next()).toUpperCase();
                if ( choice2 == "RETRY")
                {
                    ACTIONMISSPELT();
                }
                 else 
                {
                    System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                    System.exit(0);
                    
                }
        
    }



    public static void main(String[] args) 
    {
    welcome();
    CHOICE(choice);
    }
    }



