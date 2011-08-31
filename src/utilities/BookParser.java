package utilities;

import java.io.*;
import business.Booking;

public class BookParser {
    private String fileName;
    
    public BookParser(String fileName){
        this.fileName = fileName;
    }
    
    public void parseBooks(){
        try{
            FileInputStream fiStream = new FileInputStream(fileName);
            DataInputStream diStream = new DataInputStream(fiStream);
            Booking book = new Booking();
            BufferedReader breader = new BufferedReader(
                    new InputStreamReader(diStream));
            
            String newLine;
            while((newLine = breader.readLine()) != null){
                String[] tokens = newLine.split("[-]");
                book.book(tokens[0], tokens[1], tokens[2], tokens[3], 
                        Long.valueOf(tokens[4]), tokens[5], tokens[6], 
                        Long.valueOf(tokens[7]), Integer.parseInt(tokens[8]));
            }
            book.printCustomers();
        }catch(FileNotFoundException e0){
            e0.printStackTrace();
        }catch(IOException e1){
            e1.printStackTrace();
        }
    }
}