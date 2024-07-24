//WRITE A PROGRAM TO MAKE CURRENCY CONVERTER ACCORDING TO THE GIVEN CONDITIONS.
/*Currency Selection: Allow the user to choose the base currency and the target currency.
  Currency Rates: Fetch real-time exchange rates from a reliable API.
  Amount Input: Take input from the user for the amount they want to convert.
  Currency Conversion: Convert the input amount from the base currency to the target currency using the 
  fetched exchange rate.
  Display Result: Show the converted amount and the target currency symbol to the user.
*/
import java.util.Scanner; //IMPORT SCANNER CLASS
//MAKE A CLASS AND ASSIGN ITS NAME
class currencyconverter
//OPENING OF CLASS
{
    //EXECUTION START OF PROGRAM FROM THE MAIN METHOD
    public static void main(String arg[])
    //OPENING OF MAIN METHOD BRACKET
    {
        System.out.println("_____________________");   //DISPLAYING THE UNDERSCORE
        System.out.println("CURRENCY CONVERTER");     //DISPLAYING THE CODE NAME
        System.out.println("_____________________"); //DISPLAYING THE UNDERSORE
        int ch;                                     //INITIALIZE THE VARIABLE WITH DATATYPE
        double RSToDOLLARrate=0.012,DOLLARToRSrate=83.518501,RSamount,DOLLARamount; //INITIALIZE THE VARIABLE WITH DATATYPE
        double RSToSRIRSrate=3.64,SRIRSToRSrate=0.27,SRIRSamount; //INITIALIZE THE VARIABLE WITH DATATYPE
        Scanner sc=new Scanner(System.in);           //CALL SYSTEM CLASS IN SCANNER
        System.out.println("1-> Convert RS to DOLLAR");    //MENU DRIVEN RS=INDIAN RUPEES
        System.out.println("2-> Convert DOLLAR to RS");   //MENU DRIVEN 
        System.out.println("3. Convert RS to SRIRS");    //MENU DRIVEN  SRIRS=SRILANKAN RUPEES
        System.out.println("4. Convert SRIRS to RS");   //MENU DRIVEN
        System.out.println("5-> EXIT");                //MENU DRIVEN
        System.out.print("ENTER YOUR CHOICE= ");      //PRINT INSTRUCTION 
        ch=sc.nextInt();                             //VALUE ASSIGN TO THE VARIABLE ch
        //USING SWITCH METHOD
        switch(ch)
        //OPENING OF SWITCH METHOD BRACKET
        {
            case 1:     //OPENING OF CASE1
             boolean convertagain=true;//INITIALIZE THE VARIABLE WITH DATATYPE
             //WHILE METHOD              
             while (convertagain)
             {
              System.out.print("ENTER THE AMOUNT IN RS= "); //PRINT INSTRUCTION 
              RSamount=sc.nextDouble();                    //VALUE ASSIGN TO THE VARIABLE RSamount
              DOLLARamount=RSamount * RSToDOLLARrate;     //CALCULATION CONVERSION RS TO DOLLAR
              System.out.println(RSamount + " RS is equivalent to " + DOLLARamount + " DOLLAR"); //PRINT RESULT
              System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
              String chAgain = sc.next();
              convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");//PRINT INSTRUCTION
            break;       //TERMINATE THE CASE1

            case 2:     //OPENING OF CASE2
              convertagain=true;
              while (convertagain)
             {
              System.out.print("ENTER AMOUNT IN DOLLAR= ");//PRINT INSTRUCTION
              DOLLARamount=sc.nextDouble();               //VALUE ASSIGN TO THE VARIABLE DOLLARamount
              RSamount=DOLLARamount * DOLLARToRSrate;    //CALCULATION CONVERSION DOLLAR TO RS
              System.out.println(DOLLARamount + " DOLLAR is equivalent to " + RSamount + " RS"); //PRINT RESULT
              System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
              String chAgain = sc.next();
              convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");//PRINT INSTRUCTION
            break;        //TERMINATE THE CASE2

            case 3:      //OPENING OF CASE3
              convertagain=true;
              while (convertagain)
             {
               System.out.print("ENTER THE AMOUNT IN RS= "); //PRINT INSTRUCTION 
               RSamount=sc.nextDouble();                    //VALUE ASSIGN TO THE VARIABLE RSamount
               SRIRSamount=RSamount * RSToSRIRSrate;       //CALCULATION CONVERSION RS TO SRIRS
               System.out.println(RSamount + " RS is equivalent to " + SRIRSamount + " SRI LANKAN RUPEES "); //PRINT RESULT
               System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
               String chAgain = sc.next();
               convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");//PRINT INSTRUCTION
            break;       //TERMINATE THE CASE3

            case 4:     //OPENING OF CASE4
              convertagain=true;
              while (convertagain)
             {
              System.out.print("ENTER THE AMOUNT IN SRIRS= "); //PRINT INSTRUCTION 
              SRIRSamount=sc.nextDouble();                    //VALUE ASSIGN TO THE VARIABLE SRIRSamount
              RSamount=SRIRSamount * SRIRSToRSrate;          //CALCULATION CONVERSION SRIRS TO RS
              System.out.println(SRIRSamount + " SRIRS is equivalent to " + RSamount + " RS"); //PRINT RESULT
              System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
              String chAgain = sc.next();
              convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");//PRINT INSTRUCTION
            break;        //TERMINATE THE CASE4

            case 5:      //OPENING OF CASE5
            System.out.println("THANKU FOR USING CURRENCY CONVERTER"); //PRINT INSTRUCTION
            break;       //TERMINATE THE CASE5

            default:    //ASSIGN DEFAULT CASE
            System.out.println("INVALID CHOICE. PLEASE TRY AGAIN.");  //PRINT INSTRUCTION
        } //CLOSEING OF SWITCH METHOD BRACKET
    }    //CLOSING OF MAIN METHOD BRACKET
}       //CLOSING OF CLASS