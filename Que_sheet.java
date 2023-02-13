import java.util.Scanner;

public class Que_sheet {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name=scanner.next();
            System.out.println("Hello "+name+" have good a day!");
            System.out.println("hey "+name+" your are handsome boy");

            System.out.println("--------------------");

            System.out.println("Convert km to m");
            float kilometer,meter;
            System.out.print("Enter km: ");
            kilometer=scanner.nextFloat();
            meter=kilometer*1000;
             System.out.println("Conversion is: "+meter);
        }
       
        
        }
    }


