import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Vehicle> rentedVehicle=new ArrayList<>();

    loop:    while(true){
            System.out.println();
            System.out.println("Vehicle Rental System . ");
            System.out.println("1. Rent a car .");
            System.out.println("2. Rent a bike .");
            System.out.println("3. Rent a truck .");
            System.out.println("4. view rented vehicle .");
            System.out.println("5. Exit .");
            System.out.println();

            System.out.println("Enter your choice : ");
            int num=s.nextInt();
            switch (num){

                case 1 :
                    System.out.println();
                    System.out.print("Enter car model : ");
                    String mode=s.next();
                    mode +=s.nextLine();
                    System.out.print("Enter Rental days : ");
                    int day=s.nextInt();
                    Cars c = new Cars(mode,day);
                    c.displayDetails();
                    rentedVehicle.add(c);
                    break ;

                case 2 :
                    System.out.println();
                    System.out.print("Enter bike brand : ");
                    String bran=s.next();
                    bran+=s.nextLine();
                    System.out.print("Enter Rental hours : ");
                    int hou=s.nextInt();
                    Bikes b = new Bikes(bran,hou);
                    b.displayDetails();
                    rentedVehicle.add(b);
                    break;

                case 3 :
                    System.out.print("Enter truck type : ");
                    String typ=s.next();
                    typ+=s.nextLine();
                    System.out.print("Enter Rental weeks : ");
                    int wee=s.nextInt();
                    Trucks t = new Trucks(typ,wee);
                    t.displayDetails();
                    rentedVehicle.add(t);
                    break;

                case 4 :
                    for(Vehicle v : rentedVehicle){
                        v.displayDetails();
                        System.out.println();
                    }

                    break ;

                case 5 :
                    System.out.println("Thank you for using the vehicle rental system!");
                    break loop;
            }
        }
    }

}