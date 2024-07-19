package PATTERNS;
import java.util.*;                               //use equal ignore case and all set 
public class PATTERN
{
    static String pattern;
    static int i = 1; // IT IS USED AS A COUNTER VARIABLE SO THAT THE CODE CAN WELCOME U ONCE ONLY AND THEN MAY NOT IRRITATE THE USER BY SHOWING THE WELCOME SIGN AGAIN AND AGAIN 
    static String choice;
    static Scanner as = new Scanner( System.in);
    static String arr[]= { "PYRAMID PATTERN","RIGHT HALF PYRAMID PATTERN", "LEFT HALF PYRAMID PATTERN" , "CHARACTER HALF PYRAMID PATTERN" , "ALPHABETS HALF PYRAMID PATTERN" ,"NUMBERS HALF PYRAMID PATTERN", "NUMBERS HALF INVERTED PYRAMID PATTERN" , "FLYOD'S TRIANGLE PATTERN"  , "0-1 TRIANGLE PATTERN", "HOLLOW RECTANGLE PATTERN" , "HOLLOW RHOMBUS PATTERN" ,  "SOLID RHOMBUS PATTERN" , "BUTTERFLY PATTERN" , "DIAMOND PATTERN" , "SAME NUMBERS IN VERTICAL PYRAMID PATTERN" ,""};
    static int SERIALNO;

   public static void welcome ()
    {   
         if ( i>1){
    System.out.println("CHOOSE THE NEXT PATTERN YOU WANT TO PLAY WITH"); }
        

        System.out.println("1-PYRAMID PATTERN \n2-RIGHT HALF PYRAMID PATTERN \n3-LEFT HALF PYRAMID PATTERN \n4-CHARACTER HALF PYRAMID PATTERN  \n5-ALPHABETS HALF PYRAMID PATTERN \n6-NUMBERS HALF PYRAMID PATTERN \n7-NUMBERS HALF INVERTED PYRAMID PATTERN \n8-FLYOD'S TRIANGLE PATTERN \n9-(0-1) TRIANGLE PATTERN\n10-HOLLOW RECTANGLE PATTERN \n11-HOLLOW RHOMBUS PATTERN \n12-SOLID RHOMBUS PATTERN \n13-BUTTERFLY PATTERN \n14-DIAMOND PATTERN\n15-SAME NUMBERS IN VERTICAL PYRAMID PATTERN");
        System.out.println();

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
        choice=(as.nextLine()).toUpperCase();
      i++; 
    }


    public static void ACTIONMISSPELT ()
    {   System.out.println("PLEASE NOW ENTER THE CORRECT CHOICE AMONG THESE:-");
        System.out.println("TO KNOW ABOUT "+pattern+" , ENTER 'KNOW'");
        System.out.println("TO GET EXAMPLE ABOUT "+pattern+", ENTER 'EXAMPLE'");
        System.out.println("TO DRAW A "+pattern+" , ENTER 'DRAW'");
        choice=(as.nextLine()).toUpperCase();
       
    }


    public static void PATTERNMISSPELT()
    {
        System.out.println("1-PYRAMID PATTERN \n2-RIGHT HALF PYRAMID PATTERN \n3-LEFT HALF PYRAMID PATTERN \n4-CHARACTER HALF PYRAMID PATTERN  \n5-ALPHABETS HALF PYRAMID PATTERN \n6-NUMBERS HALF PYRAMID PATTERN \n7-NUMBERS HALF INVERTED PYRAMID PATTERN \n8-FLYOD'S TRIANGLE PATTERN \n9-(0-1) TRIANGLE PATTERN\n10-HOLLOW RECTANGLE PATTERN \n11-HOLLOW RHOMBUS PATTERN \n12-SOLID RHOMBUS PATTERN \n13-BUTTERFLY PATTERN \n14-DIAMOND PATTERN\n15-SAME NUMBERS IN VERTICAL PYRAMID PATTERN");

        System.out.println("PLEASE NOW ENTER THE CORRECT NAME OR THE SERIAL NUMBER OF THE PATTERN YOU ARE INTERESTED IN");
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



    }

    public static void REPEATS()
    {
        System.out.println("IF YOU WANT TO CONTINUE WITH THE "+pattern+ " ENTER THE ACTION WHICH YOU WANT TO PERFORM NOW");
        System.out.println("ELSE IF YOU WANT TO TRY DIFFERENT PATTERNS NOW ENTER 'LIST' TO SEE THE PATTERNS AVAILABLE");
        System.out.println("OR IF U WANT TO LEAVE ENTER 'EXIT' ");
        choice=(as.nextLine()).toUpperCase();

        if(choice.equalsIgnoreCase("LIST"))
    {
        welcome();
    }
        else if (choice.equalsIgnoreCase("EXIT"))
        {
            System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                    System.exit(0);
        }

        else if ( choice.equalsIgnoreCase("KNOW")||choice.equalsIgnoreCase("DRAW")||choice.equalsIgnoreCase("EXAMPLE"))
        CHOICE(choice);

        else  
        {
            System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
            System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
            String choice2=(as.nextLine()).toUpperCase();
            if ( choice2.equalsIgnoreCase("RETRY"))
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
                    System.out.println("PYRAMIDD PATTERN:-\nIN THIS PATTERN WE WILL ARRANGE '*' IN FORM OF A TWO DIMENSIONAL EGYPTIAN PYRAMID WHICH ALSO LOOKS LIKE A TRIANGLE AS IT IS A 2D REPRESENTATION ONLY");
                }break;
 // write a description here
                
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
            String choice2=(as.nextLine()).toUpperCase();
            if ( choice2.equalsIgnoreCase( "RETRY"))
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
    for (int j = 2; j <=5 ;j =j+2)
    {
        System.out.println("THIS IS A "+pattern+ "OF SIZE 3");
        DRAW(1,j+1); 
    }
       
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
        String choice2=(as.nextLine()).toUpperCase();
        if ( choice2.equalsIgnoreCase( "RETRY"))
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

            
            case 2:
            {
                
                    for ( int i = 1; i <=size ;i++)
                    {
                        for (int j =1 ; j <=i ; j++)
                        System.out.print("*");
                        System.out.println();
                    }
                
            }break;

            
            case 3: 
            { for ( int i = 1; i <=size ;i++)
                {
                    for (int j=1; j <=size-i ; j++)
                    System.out.print(" ");
                    
                    for (int j=1; j <=i ; j++)
                    System.out.print("*");
        
                    System.out.println();
                }
            }break;

            //try to do a variation of removing spaces and printing characters from ASCII=1 to counting 
            case 4:
            {
                int ASCII= 65;
        for ( int i = 1; i <=size ;i++)
        {
            for (int j =1 ; j <=i ; j++)
            {
                char CHAR= (char)ASCII;
                System.out.print(CHAR); 
                ASCII++;
            }
            System.out.println();

            }}
            break;
            
            
            case 5:
            {         int ASCII= 65;
                for ( int i = 1; i <=size ;i++)
                {
                    for (int j =1 ; j <=i ; j++)
                    {
                        char CHAR= (char)ASCII;
                        System.out.print(CHAR); 
                        
                    }
                    ASCII++;
                    System.out.println();
                } 

            }break;

           
            case 6:
            {}break;

          
            case 7:
            {}break;

           
            case 8:
            {}break;

           
            case 9:
            {}break;

            
            case 10:
            {}break;
            
            case 11:
            {}break;

            
            case 12:
            {}break;
            
            case 13:
            {}break;
            
            case 14:
            {}break;
            
            case 15:
            {}break;
        

            default:
            {
                System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
                System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
                String choice2=(as.nextLine()).toUpperCase();
                if ( choice2.equalsIgnoreCase( "RETRY"))
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
        if ( choice.equalsIgnoreCase("KNOW"))
        KNOW(SERIALNO);

        else if (choice.equalsIgnoreCase("EXAMPLE"))
        EXAMPLE(SERIALNO);

        else if (choice.equalsIgnoreCase("DRAW"))
        {
            System.out.println("PLEASE ENTER THE SIZE OF "+pattern+" YOU WANT TO BE CREATED");
            int siz=as.nextInt();
            as.nextLine(); // Consume the leftover newline character
            DRAW(SERIALNO,siz);
        }
        

        else 
        System.out.println("YOU HAVE EITHER MISSPELT THE ACTION OR ENTERED A WRONG ACTION TO BE PERFORMED ON "+pattern);
        System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
                String choice2=(as.nextLine()).toUpperCase();
                if ( choice2.equalsIgnoreCase( "RETRY"))
                {
                    ACTIONMISSPELT();
                }
                 else 
                {
                    System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \nHOPE YOU WILL VIST AGAIN TO PLAY MORE");
                    System.exit(0);
                    
                }
        
    }



    public static void main(String[] args) 
    {
        System.out.println("WELCOME TO FUN TO PATTERNS \nHERE IS THE LIST OF THE PATTENS U CAN CHOOSE TO KNOW ABOUT OR GET AN EXAMPLE OR DRAW OF DESIRED SIZE");
    welcome();
    CHOICE(choice);
    }
    }



