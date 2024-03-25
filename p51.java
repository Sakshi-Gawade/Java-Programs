/*Write a program to display the system date and time in various formats shown below: Current date is 
: 31/08/2021 Current date is : 08-31-2021 Current date is : Tuesday August 31 2021 Current date and 
time is : Fri August 31 15:25:59 IST 2021 Current date and time is : 31/08/21 15:25:59 PM +0530 */

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  
public class p51
{  
public static void main(String[] args)
{  
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate = formatter.format(date);  
    System.out.println("Current date is: "+strDate);  
  
    formatter = new SimpleDateFormat("MM-dd-yyyy");  
    strDate = formatter.format(date);  
    System.out.println("Current date is: "+strDate);  
    
    formatter = new SimpleDateFormat("EEEEEE MMMM dd yyyy");  
    strDate = formatter.format(date);  
    System.out.println("Current date is: "+strDate);  
    
    formatter = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");  
    strDate = formatter.format(date);  
    System.out.println("Current date and time is: "+strDate);  
    
    formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");  
    strDate = formatter.format(date);  
    System.out.println("Current date and time is: "+strDate);   
}  
}  

