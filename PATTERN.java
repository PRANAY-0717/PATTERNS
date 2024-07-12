package PATTERNS;
import java.util.*;
public class PATTERN
{
    static String pattern;
    static String choice;
    static Scanner as = new Scanner( System.in);
    static String arr[]= { "PYRAMID PATTERN","RIGHT HALF PYRAMID PATTERN", "LEFT HALF PYRAMID PATTERN" , "CHARACTER HALF PYRAMID PATTERN" , 
                         "ALPHABETS HALF PYRAMID PATTERN" ,"NUMBERS HALF PYRAMID PATTERN", "NUMBERS HALF INVERTED PYRAMID PATTERN" , 
                         "FLYOD'S TRIANGLE PATTERN"  , "0-1 TRAIANGLE PATTERN", "HOLLOW RECTANGLE PATTERN" , " HOLLOW RHOMBUS PATTERN" ,  "SOLID RHOMBUS PATTERN"
                          , "BUTTERFLY PATTERN" , "DIAMOND PATTERN" , "SAME NUMBERS IN VERTICAL PYRAMID PATTERN" ,""};
    static int SERIALNO;

   public static void welcome ()
    {   int i = 1; 
        if( i==1)
        {
        System.out.println("WELCOME TO FUN TO PATTERNS \n HERE IS THE LIST OF THE PATTENS U CAN CHOOSE TO KNOW ABOUT OR GET AN EXAMPLE OR DRAW OF DESIRED SIZE");
        i++;
        }

        else
        {
            System.out.println("CHOOSE THE NEXT PATTERN YOU WANT TO PLAY WITH"); i++;
        }
        System.out.println();// add the patterns here 
        System.out.println("ENTER THE NAME OR THE SERIAL NUMBER OF THE PATTERN YOU ARE INTERESTED IN");
        pattern=(as.nextLine()).toUpperCase();

        if (pattern == "1" ||pattern == "2" ||pattern == "3" ||pattern == "4" ||pattern == "5" ||pattern == "6" ||pattern == "7" || pattern == "8" ||
            pattern == "9" ||pattern == "10" ||pattern == "11" ||pattern == "12" ||pattern == "13" ||pattern == "14" ||pattern == "15"  );
            {
              SERIALNO = Integer.valueOf(pattern);
              pattern = arr[(SERIALNO-1)];
            
            }
            //linear search 
        else            
            {
                  for ( int j = 1 ; j <=arr.length ; j ++ )
                  {
                     if (pattern==arr[j-1])  SERIALNO= j ;
                  }
            }

        System.out.println("TO KNOW ABOUT "+pattern+" , ENTER 'KNOW'");
        System.out.println("TO GET EXAMPLE ABOUT "+pattern+", ENTER 'EXAMPLE'");
        System.out.println("TO DRAW A "+pattern+" , ENTER 'DRAW'");
        choice=(as.next()).toUpperCase();
       
    }


    public static void ACTIONMISSPELT ()
    {   
        System.out.println("TO KNOW ABOUT "+pattern+" , ENTER 'KNOW'");
        System.out.println("TO GET EXAMPLE ABOUT "+pattern+", ENTER 'EXAMPLE'");
        System.out.println("TO DRAW A "+pattern+" , ENTER 'DRAW'");
        choice=(as.next()).toUpperCase();
       
    }

    public static void KNOW(String pattern)
    {
        switch (pattern) 
        {
            case "value":
            {
                  System.out.println();//give description about all the patterns here by repeating the cases 
          
        }
                break;
        
            
            default:
            {
            System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
            System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
            String choice2=(as.next()).toUpperCase();
            if ( choice2 == "RETRY")
            {
                //GET THE CONTROL BACK TO ACTION MISSPELT
            }

            else 
            {
                System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                System.exit(0);
                
            }
        }
                break;
        }REPEAT();
        
        
    }

    public static void EXAMPLE (String pattern)
    {
switch (pattern) {
    case "value":
        //print patterns here 
        break;

    default:
    {
        System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
        System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
        String choice2=(as.next()).toUpperCase();
        if ( choice2 == "RETRY")
        {
            //GET THE CONTROL BACK WITH AGAIN ADDED 
        }

        else 
        {
            System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
            System.exit(0);
            
        }
    }
        break;
}
REPEAT();
    }

    public static void DRAW(String pattern)
    {
        switch (pattern) {
            case "value":
                {
                    System.out.println();//print patterns here
                }
                break;
        
            default:
            {
                System.out.println("PLEASE SEE FOR ANY MISSPELT OR ANY NON EXISTING CHOICE IS ENTERED");
                System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
                String choice2=(as.next()).toUpperCase();
                if ( choice2 == "RETRY")
                {
                    //GET THE CONTROL BACK WITH AGAIN ADDED 
                }
    
                else 
                {
                    System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                    System.exit(0);
                    
                }
            }
                break;
        }REPEAT();
    }

    public static void CHOICE(String choice)
    {
        if ( choice =="KNOW")
        KNOW(pattern);

        else if ( choice == "EXAMPLE")
        EXAMPLE(pattern);

        else if (choice == "DRAW")
        DRAW(pattern);

        else 
        System.out.println("YOU HAVE EITHER MISSPELT THE ACTION OR ENTERED A WRONG ACTION TO BE PERFORMED ON "+pattern);
        System.out.println("IF YOU WANT TO CONTINUE PLEASE ENTER 'RETRY' ELSE ENTER 'EXIT' TO LEAVE");
                String choice2=(as.next()).toUpperCase();
                if ( choice2 == "RETRY")
                {
                    //GET THE CONTROL BACK WITH AGAIN ADDED 
                }
                 else 
                {
                    System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                    System.exit(0);
                    
                }
        
    }

    public static void REPEAT()
    {
        System.out.println("IF YOU WANT TO CONTINUE WITH THE "+pattern+ " ENTER THE ACTION WHICH YOU WANT TO PERFORM NOW");
        System.out.println("ELSE IF YOU WANT TO TRY DIFFERENT PATTERNS NOW ENTER 'LIST' TO SEE THE PATTERNS AVAILABLE");
        System.out.println("OR IF U WANT TO LEAVE ENTER 'EXIT' ");
        choice=as.next();
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
                //GET THE CONTROL BACK WITH AGAIN ADDED 
            }

            else 
            {
                System.out.println("THANK YOU FOR ENTERING IN FUN WITH PATTERNS \n HOPE YOU WILL VIST AGAIN TO PLAY MORE");
                System.exit(0);
                
            }
        }

    }

    public static void main(String[] args) 
    {
    welcome();
    CHOICE(choice);
    

    }
    }



