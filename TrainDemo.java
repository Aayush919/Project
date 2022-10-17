import java.awt.print.Book;
import java.util.Scanner;
import java.util.ArrayList;

public class TrainDemo {
    public static void main(String[] args) {
        ArrayList <Train> trains=new ArrayList<Train>();
        ArrayList<Booking> bookings=new ArrayList<>();
        trains.add(new Train(1,true,2));
        trains.add(new Train(2,false,50));
        trains.add(new Train(3,true,48));


        int userOpt=1;
        Scanner scanner=new Scanner(System.in);
        for( Train t:trains) {
            t.displayTrainInfo();
        }
        while(userOpt==1){
            System.out.println("Enter 1 to Book and 2 to Exit");
            userOpt=scanner.nextInt();
            if(userOpt==1) {
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,trains)) {
                    bookings.add(booking);
                    System.out.println("Your booking is conformed");
                    System.out.println("                                                    " );
                    System.out.println("_____________________THANK YOU______________________");

                }
                else {
                    System.out.println("Sorry, Train Is Full ,Try To Another Train Or Date.");

                }
            }
        }
    }
}
