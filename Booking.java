import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
        String PassengerName;
        int trainNo;
        Date date;
        Booking(){
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter Name Of Passenger: ");
                PassengerName =scanner.next();
                System.out.println("Enter Train No: ");
                trainNo=scanner.nextInt();
                System.out.println("Enter date dd-mm-yyyy: ");
               String dateInput =scanner.next();
               SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

               try {
                   date = dateFormat.parse(dateInput);
               }
               catch (ParseException e) {
                   //TODO auto-generated catch block
                 e.printStackTrace();
               }

            }
            public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Train> trains){
             int capacity=0;
             for(Train train:trains) {
             if(train.getTrainNo()==trainNo) {
                 capacity=train.getCapacity();
             }
             }
             int booked=0;
             for(Booking t:bookings){
                if(t.trainNo==trainNo && t.date.equals(date)) {
                  booked++;
                }
             }
            return booked<capacity?true:false;
            }
        }

