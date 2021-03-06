
import java.util.Scanner; 
public class AirplaneSeatReservation
{
    int counter = 0 ; 
    double cost = 0.0 ; 
    String[]  reservedSeat = new String[50];
    String[] reservedSeat2 = {"1A","2F","3A","3B","3F","4A","5E","5F","6A","6B","6C","7B","7C","7D","7E","8A","8F","9A","9B","10D","10E","10F","11A","11B","11C","11D","11E","11F"};
    int k = 27;

    void displayAirplaneSeats()
    {
        //display statement 
        System.out.println("            Business class:         ");
        System.out.println("▢ 1A                             1F ▢");
        System.out.println("▢ 2A                             2F ▢");

        System.out.println("             First Class            ");
        System.out.println("▢ 3A   3B                   3E   3F ▢");
        System.out.println("▢ 4A   4B                   4E   4F ▢");
        System.out.println("▢ 5A   5B                   5E   5F ▢");

        System.out.println("             Economy Class           ");
        System.out.println("▢ 6A   6B   6C         6D   6E   6F ▢");
        System.out.println("▢ 7A   7B   7C         7D   7E   7F ▢");
        System.out.println("▢ 8A   8B   8C         8D   8E   8F ▢");
        System.out.println("▢ 9A   9B   9C         9D   9E   9F ▢");
        System.out.println("▢ 10A  10B  10C       10D  10E  10F ▢");
        System.out.println("▢ 11A  11B  11C       11D  11E  11F ▢");

        //displaying the reserved seats 
        System.err.println("The reserved seats are: ");
        for(int i = 0 ; i <= k ; i++)
        {
            System.err.println(reservedSeat2[i]);
            reservedSeat[i] = reservedSeat2[i];
        }
        
        System.err.println();
        System.err.println("PLEASE SCROLL UP TO SEE ALL THE RESERVED SEATS");
    }

    void Choose(InputDetails obj1)
    {
        Scanner input = new Scanner(System.in);
        //InputDetails obj1 = new InputDetails(); 

        boolean check = true; 
        boolean flag = false;

        while(check == true && k < 50)
        {
            //display statement
            System.out.println("Please enter the seat number that you want to reserve ");
            String seat = input.nextLine().trim(); 
            int numSeat = Integer.parseInt(seat.substring(0,1));

            for(int i = 0 ; i <= k ; i++)
            {
                if(reservedSeat[i].equals(seat))
                {
                    System.out.println("OOPS LOOKS LIKE YOU THAT SEAT HAS ALREADY BEEN RESERVED!!");
                    flag = true;
                }
            }

            if(flag == false)
            {
                k++;
                reservedSeat[k] = seat;
            }

            System.out.println("do you want to reserve another seat ?");
            if( input.nextLine().trim().equalsIgnoreCase("yes"))
            {
                if(flag == false)
                {
                    System.out.println("Boarding Pass: ") ;
                    System.out.println();

                    System.out.println(obj1.name + "\t" + "Flight: OKL012" + "\t" + "seat number: " + reservedSeat[k]);
                    System.out.println("Gate: 47        date: " + obj1.date); 

                    System.out.println("\n" + "Have a great time" ); 

                    if(numSeat == 1 || numSeat == 2)
                    {
                        cost = cost + 200000;
                    }
                    else if ( numSeat == 3 || numSeat == 4 || numSeat == 5)
                    {
                        cost = cost + 110000;
                    }
                    else
                    {
                        cost = cost = 60000;
                    }
                }

                check = true;
            }
            else
            {
                System.out.println("Boarding Pass: ") ;
                System.out.println();

                System.out.println(obj1.name + "\t" + "Flight: OKL012" + "\t" + "seat number: " + reservedSeat[k]);
                System.out.println("Gate: 47        date: " + obj1.date); 

                System.out.println("\n" + "Have a great time" ); 

                if(numSeat == 1 || numSeat == 2)
                {
                    cost = cost + 200000;
                }
                else if ( numSeat == 3 || numSeat == 4 || numSeat == 5)
                {
                    cost = cost + 110000;
                }
                else 
                {
                    cost = cost = 60000;
                }

                check = false;
            }

            flag = false;
        }
    }
}
