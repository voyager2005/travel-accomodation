import java.util.Scanner; 
public class InputDetails
{
    String name ; 
    String date;
    public String currentLocation ; 
    public String destination; 
    public long phoneNumber; 
    boolean hotel ; 

    void displayWelcome()
    {
        System.out.print("\f");
        System.out.println(); 
        String line1 = " *       *   * * * *   *         * * *    * * * *    *     *   * * * * ";
        String line2 = " *       *   *         *        *        *       *   * * * *   *       ";
        String line3 = " *   *   *   * * * *   *       *        *         *  *  *  *   * * * * ";
        String line4 = " * *   * *   *         *        *        *       *   *     *   *       ";
        String line5 = " *       *   * * * *   * * * *   * * *    * * * *    *     *   * * * * ";
        
        for(int i = 0 ;i < line1.length() ; i++)
        {
            char ch = line1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(25);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println();
        for(int i = 0 ;i < line2.length() ; i++)
        {
            char ch = line2.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(25);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println();
        for(int i = 0 ;i < line3.length() ; i++)
        {
            char ch = line3.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(25);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println();
        for(int i = 0 ;i < line4.length() ; i++)
        {
            char ch = line4.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(25);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println();
        for(int i = 0 ;i < line5.length() ; i++)
        {
            char ch = line5.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(25);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println(); 
    }

    void name()
    {
        Scanner sc = new Scanner(System.in); 

        String s1 = "Your name please!";
        for(int i = 0 ;i < s1.length() ; i++)
        {
            char ch = s1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(55);
            }
            catch(Exception e)
            {

            }
        }
        
        System.out.println();

        name = sc.nextLine().trim() ; 
    }

    void nameCapital()
    {
        String name = this.name ;
        name = name + " " ; 

        String word = "" ; 
        String newWord = ""; 
        String s2 = ""; 

        for(int i = 0 ; i < name.length() ; i++)
        {
            char ch = name.charAt(i); 
            word = word + ch  ; 

            if(ch == ' ')
            {
                char firstWord = word.charAt(0); 
                newWord = word.substring(1); 

                firstWord = Character.toUpperCase(firstWord);
                newWord = firstWord + newWord ; 

                s2 = s2 + newWord  ; 
                word = "" ; 
            }
        }

        name = s2 ; 
        this.name = name;
    }

    void OtherDetails()
    {
        Scanner sc = new Scanner(System.in);

        //prompt and accept
        String s2 = "We would like to take up more detals... Please do cooperate ";
        for(int i = 0 ;i < s2.length() ; i++)
        {
            char ch = s2.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(55);
            }
            catch(Exception e)
            {

            }
        }
        
        System.out.println();
        System.out.println("Phone Number: ");
        System.out.println();
        phoneNumber = sc.nextLong(); 

        System.out.println("\nPlease enter your current location and your travel location");
        sc.nextLine().trim(); 
        currentLocation = sc.nextLine().trim(); 
        destination = sc.nextLine().trim(); 
        
        currentLocation = currentLocation.toUpperCase();
        destination = destination.toUpperCase();
        
        System.out.println("\nYour Date of Travel: \nformat ( date name_of_the_month year)");
        date = sc.nextLine().trim(); 
        
        System.out.println();

    }
}
