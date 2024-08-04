package PATTERNS;
import java.util.*;                              
public class PATTERN
{
    static String pattern;
    static int i = 1; // IT IS USED AS A COUNTER VARIABLE SO THAT THE CODE CAN WELCOME U ONCE ONLY AND THEN MAY NOT IRRITATE THE USER BY SHOWING THE WELCOME SIGN AGAIN AND AGAIN 
    static String choice;
    static Scanner as = new Scanner( System.in);
    static String arr[]= { "PYRAMID PATTERN","RIGHT HALF PYRAMID PATTERN", "LEFT HALF PYRAMID PATTERN" , "CHARACTER HALF PYRAMID PATTERN" , "ALPHABETS HALF PYRAMID PATTERN" ,"NUMBERS HALF PYRAMID PATTERN", "NUMBERS HALF INVERTED PYRAMID PATTERN" , "FLYOD'S TRIANGLE PATTERN"  , "0-1 TRIANGLE PATTERN", "HOLLOW SQUARE PATTERN" , "HOLLOW RHOMBUS PATTERN" ,  "SOLID RHOMBUS PATTERN" , "BUTTERFLY PATTERN" , "DIAMOND PATTERN" , "SAME NUMBERS IN VERTICAL PYRAMID PATTERN"};
    static int SERIALNO;

   public static void welcome ()
    {   
         if ( i>1){{System.out.println();
    System.out.println("\n\nCHOOSE THE NEXT PATTERN YOU WANT TO PLAY WITH"); }
         }

        System.out.println("1-PYRAMID PATTERN \n2-RIGHT HALF PYRAMID PATTERN \n3-LEFT HALF PYRAMID PATTERN \n4-CHARACTER HALF PYRAMID PATTERN  \n5-ALPHABETS HALF PYRAMID PATTERN \n6-NUMBERS HALF PYRAMID PATTERN \n7-NUMBERS HALF INVERTED PYRAMID PATTERN \n8-FLYOD'S TRIANGLE PATTERN \n9-(0-1) TRIANGLE PATTERN\n10-HOLLOW SQUARE PATTERN \n11-HOLLOW RHOMBUS PATTERN \n12-SOLID RHOMBUS PATTERN \n13-BUTTERFLY PATTERN \n14-DIAMOND PATTERN\n15-SAME NUMBERS IN VERTICAL PYRAMID PATTERN");
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
        System.out.println("1-PYRAMID PATTERN \n2-RIGHT HALF PYRAMID PATTERN \n3-LEFT HALF PYRAMID PATTERN \n4-CHARACTER HALF PYRAMID PATTERN  \n5-ALPHABETS HALF PYRAMID PATTERN \n6-NUMBERS HALF PYRAMID PATTERN \n7-NUMBERS HALF INVERTED PYRAMID PATTERN \n8-FLYOD'S TRIANGLE PATTERN \n9-(0-1) TRIANGLE PATTERN\n10-HOLLOW SQUARE PATTERN \n11-HOLLOW RHOMBUS PATTERN \n12-SOLID RHOMBUS PATTERN \n13-BUTTERFLY PATTERN \n14-DIAMOND PATTERN\n15-SAME NUMBERS IN VERTICAL PYRAMID PATTERN");

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

            as.nextLine();

    }
//copied directly FROM INTERNET (LOL US PROGRAMMERS)

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public static void REPEATS()
    {
       System.out.println("IF U WANT TO DRAW "+ pattern+ " PLEASE ENTER THE SIZE U WANT TO DRAW ELSE ENTER 'NO'");

        String REDRAW=as.next();
        as.nextLine();
        if (isNumeric(REDRAW))
        {   int resize=Integer.valueOf(REDRAW);
            DRAW(SERIALNO,resize);
        }
        else if ( REDRAW.equalsIgnoreCase("NO"))
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
            as.nextLine();
                    System.exit(0);
        }

        else if ( choice.equalsIgnoreCase("KNOW")||choice.equalsIgnoreCase("DRAW")||choice.equalsIgnoreCase("EXAMPLE"))
        as.nextLine();
        CHOICE(choice);
    
         
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
        as.nextLine();
    }

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

            case 1:
            {
                System.out.println("PYRAMID PATTERN:\nIn this pattern, we will arrange '*' in the form of a two-dimensional Egyptian pyramid, which also looks like a triangle since it is a 2D representation.");
            } break;
            
            case 2:
            {
                System.out.println("RIGHT HALF PYRAMID PATTERN:\nIn this pattern, we will arrange '*' in the form of the right half of a complete pyramid, which can also look like a right-angle triangle with its hypotenuse pointing outward to the top right of the screen.");
            } break;
            
            case 3:
            {
                System.out.println("LEFT HALF PYRAMID PATTERN:\nIn this pattern, we will arrange '*' in the form of the left half of a complete pyramid, which can also look like a right-angle triangle with its hypotenuse pointing outward to the top right of the display.");
            } break;
            
            case 4:
            {
                System.out.println("CHARACTER HALF PYRAMID PATTERN:\nIn this pattern, we will make a half pyramid that looks like a right-angled triangle with its hypotenuse pointing outward to the top right side of the screen. This pattern will be printed with a mix of special characters, letters, and digits, excluding spaces.");
            } break;
            
            case 5:
            {
                System.out.println("ALPHABETS HALF PYRAMID PATTERN:\nIn this pattern, we will make a half pyramid that looks like a right-angled triangle with its hypotenuse pointing outward to the top right side of the screen. This pattern will be printed using alphabets, either in lowercase or uppercase letters.");
            } break;
            
            case 6:
            {
                System.out.println("NUMBERS HALF PYRAMID PATTERN:\nIn this pattern, we will make a half pyramid that looks like a right-angled triangle with its hypotenuse pointing outward to the top right side of the screen. This pattern will be printed with numbers starting from 1, and the number on each line will represent the line number, printing the same amount as that digit specifies.");
            } break;
            
            case 7:
            {
                System.out.println("NUMBERS HALF INVERTED PYRAMID PATTERN:\nIn this pattern, we will make a half pyramid of a full pyramid inverted up and down, which will look like a right-angled triangle with its hypotenuse pointing to the bottom right side of the screen. This pattern will be printed with numbers, and the number on each line will represent the line number. The amount of times that number will be printed will be equal to (total number of lines - line number).");
            } break;
            
            case 8:
            {
                System.out.println("FLOYD'S TRIANGLE PATTERN:\nIn this pattern, we will draw Floyd's triangle. A Floyd triangle is a pattern where numbers are arranged in a triangle. You start with the number 1 at the top. Below it, you place the next numbers in sequence, with each row having one more number than the previous row. The first row has one number, the second row has two numbers, the third row has three numbers, and so on.");
            } break;
            
            case 9:
            {
                System.out.println("0-1 TRIANGLE PATTERN:\nIn this pattern, we will draw a half pyramid pattern that looks like a right-angled triangle with its hypotenuse pointing to the top right side of the screen. It will be printed with the digits '0' and '1' only, and each line will end with the digit '1'. Each line will print '0' and '1' exactly the same number of times as the line number.");
            } break;
            
            case 10:
            {
                System.out.println("HOLLOW SQUARE PATTERN:\nIn this pattern, we will arrange '*' in the form of a hollow square of the size or side length entered by the user.");
            } break;
            
            case 11:
            {
                System.out.println("HOLLOW RHOMBUS PATTERN:\nIn this pattern, we will arrange '*' in the form of a hollow rhombus of the size or side length entered by the user.");
            } break;
            
            case 12:
            {
                System.out.println("SOLID RHOMBUS PATTERN:\nIn this pattern, we will arrange '*' in the form of a solid rhombus or a completely filled rhombus of the size or side length entered by the user.");
            } break;
            
            case 13:
            {
                System.out.println("BUTTERFLY PATTERN:\nIn this pattern, we will arrange '*' in the form of a butterfly with its wings open on the sides of its body, creating the illustration of a top view, showing its wings and a straight line-shaped body. The size of the butterfly will be determined by the size entered by the user.");
            } break;
            
            case 14:
            {
                System.out.println("DIAMOND PATTERN:\nIn this pattern, we will arrange '*' in the form of a diamond of the size or length of the larger diagonal entered by the user.");
            } break;
            
            case 15:
            {
                System.out.println("SAME NUMBERS IN VERTICAL PYRAMID PATTERN:\nIn this pattern, we will print a full pyramid that resembles an equilateral triangle made up of numbers. This pattern will be printed with the help of numbers, with each vertical line containing the same digit. The middle vertical line will be the first, and the vertical lines next to it will be counted as the second, third, etc., depending on whether they are on the left or right side of the pyramid.");
            } break;
         
                     
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
System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
    DRAW(1,7);
       }
    break;

    case 2:
    {
        System.out.println("EXAMPLES:");
System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
     DRAW(2,7);
    }
    break;
   
    case 3:    
    {
        System.out.println("EXAMPLES:");
System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
DRAW(3,7);
}
    break;

    case 4:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(4,7);
    }  
    break;
    
    
    case 5:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(5,7);
    }
    break;

   
    case 6:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(6,7);
    }
    break;

  
    case 7:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(7,7);
    }
    break;

   
    case 8:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(8,7);
    }
    {}break;

   
    case 9:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(9,7);
    }
    break;

    
    case 10:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(10,7);
    }
    break;
    
    case 11:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(11,7);
    }
    break;

    
    case 12:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(12,7);
    }
    break;
    
    case 13:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(13,7);
    }
    break;
    
    case 14:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(14,7);
    }
    break;
    
    case 15:
    {
        System.out.println("EXAMPLES:");
        System.out.println("THIS IS A "+ pattern+ " OF SIZE = 7");
        DRAW(15,7);
    }
    break;

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
        if (size >60) System.out.println("PLEASE MINIMIZE THE TERMINAL FOR BETTER VIEW OF THE PATTERN");
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

            //we have successfuly started the series from ASCII=33 meaning leaving all the spaces and we have also removed all the spaces whcih were coming in between to give a continous look to the pattern (talking abt pattern no. 4)

            case 4:
            {
                int ASCII= 33;
        for ( int i = 1; i <=size ;i++)
        {
            for (int j =1 ; j <=i ; j++)
            {
                char CHAR= (char)ASCII;
                System.out.print(CHAR); 
                ASCII++;
                if (ASCII==127 )
                ASCII=161;
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
            {
               for ( int i = 1 ; i <=size ; i ++)
               {
                for ( int j = 1; j <=i ; j ++)
                System.out.print(i);
                System.out.println();
               }
               
            }
            break;

          
            case 7:
            {
                for ( int i = 1 ;  i <=size ; i ++)
                {
                    for ( int j =size-i+1; j >= 0 ; j--)
                    System.out.print(i);

                    System.out.println();
                }
              
            }
            break;

           
            case 8:
            {  int k =1 ;
                for (int i = 1; i<=size ; i ++)
                {
                    for ( int j = 1 ;j <=i; j++  )
                    System.out.print(k++);

                    System.out.println();
                }
            }break;

           
            case 9:
            {
              for ( int i =1 ; i <=size ; i ++)
              {
                for ( int j = 1; j <=i ; j ++)
                {
                    if ((i+j)%2 ==0 ) System.out.print(1);
                    else System.out.print(0);
                }
                System.out.println();
              }
            }
            break;

            
            case 10:
            {   
                for ( int i =1; i <=size ; i ++)
                {
                    for ( int j =1; j <=size; j ++ )
                    {
                        if ( i==1 || i ==size || j ==1 ||j ==size )
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            break;
            
            case 11:
            {
                for( int i =1 ; i <=size ; i ++)
                {
                  for ( int j = 1 ; j <=(size-i) ; j++)
                  System.out.print(" ");
  
                  for ( int j =1; j <=size ; j++)
                  {
                      if ( i==1 || i ==size || j ==1 ||j ==size )
                          System.out.print("*");
                  }
  
                  System.out.println();
                } 
            }
            break;

            
            case 12:
            {
               for( int i =1 ; i <=size ; i ++)
              {
                for ( int j = 1 ; j <=(size-i) ; j++)
                System.out.print(" ");

                for ( int j =1; j <=size ; j++)
                {
                     System.out.print("*");
                }

                System.out.println();
              } 
            }
            break;
            
            case 13:
            {
                for ( int i = 1 ; i <=size ; i ++)
                {
                    for (int j =1 ; j<=i ; j ++)
                    System.out.print("*");
                

                for ( int j = 1 ; j <=((size*2)-(i*2)) ; j ++)
                System.out.print(" ");
                 
                for (int j =1 ; j<=i ; j ++)
                    System.out.print("*");

                    System.out.println();
            }
              
            for ( int i = size ; i >=1 ; i --)
                {
                    for (int j =i ; j>=1 ; j --)
                    System.out.print("*");
                

                    for ( int j = 1 ; j <=((size*2)-(i*2)) ; j ++)
                    System.out.print(" ");
                     
                 
                for (int j =i ; j>=1 ; j --)
                    System.out.print("*");

                    System.out.println();
            }
        }
            break;
            
            case 14:
            {
              for( int i = 1 ;i<=size ; i++)
              {
                for ( int j = 1 ; j<=size-(i) ; j ++)
                System.out.print(" ");
                 
                for ( int j =1 ; j <=((i*2)-1); j++)
                System.out.print("*");

                System.out.println();
              }


              for( int i = size ;i>=1; i--)
              {
                for ( int j = 1 ; j<=size-(i) ; j ++)
                System.out.print(" ");
                 
                for ( int j =1 ; j <=((i*2)-1); j++)
                System.out.print("*");

                System.out.println();
              }
            }
            break;
            
            case 15:
            {
                for( int i=1 ; i <= size ;i ++)
                {
        
                  for ( int j = (size - i); j>0 ;j--)
                  {
                    System.out.print("  ");
                  }
                  if ( i==1)
                  System.out.print(i);
                  else
                  for ( int j = (0-i) ; j <=i ; j++)
                  {int c =0;//counter variable for counting the times number "1" has been printed
                  if ( j==1)
                    {
                      c++;
                    }
                    if(j!=0)
                    {
                      if (!( j==1 && c==1))
                      System.out.print(Math.abs(j)+" ");
                      
                    }
        
                  }
                  System.out.println();
                }                                                                                                          
            }
            break;
        

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
        {
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
    }



    public static void main(String[] args) 
    {System.out.println();System.out.println();
        System.out.println("WELCOME TO FUN TO PATTERNS \nHERE IS THE LIST OF THE PATTENS U CAN CHOOSE TO KNOW ABOUT OR GET AN EXAMPLE OR DRAW OF DESIRED SIZE");
    welcome();
    CHOICE(choice);
    
    }
  
    }



