package business;

import java.util.LinkedList;
import java.util.Iterator;

import entities.Bookings;
import entities.Flights;
import utilities.Cache;

public class Booking {
    private LinkedList<Bookings> customers;
    
    public void book(String id, String passportID, String firstName,
            String lastName, long phNumber, String address, String flightCode,
            long cardSerial, int cardCode){
        LinkedList<Flights> flights = Cache.getFList();
        Iterator<Flights> FList = flights.iterator();
        Flights tmpFlight = null;
        Flights flight = null;
        while(FList.hasNext()){
            tmpFlight = FList.next();
            if(tmpFlight.getFlightCode().equals(flightCode)){
                flight = tmpFlight;
                break;
            }
        }
        Bookings newCustomer = new Bookings(id, passportID, firstName, lastName,
                                    phNumber, address, flightCode, cardSerial,
                                    cardCode);
        flight.getBookings().add(newCustomer);
    }
    public void printCustomers(){
        LinkedList<Flights> flights = Cache.getFList();
        Iterator<Flights> FList = flights.iterator();
        while(FList.hasNext()){
            System.out.println(FList.next().getBookings());
        }
    }
}
