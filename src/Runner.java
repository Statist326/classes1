import by.epam.lab.BusinessTrip;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
         double m=0,n=0;
         int contain=0;
        Scanner scanner = new Scanner(System.in);
       BusinessTrip[] businessTrips = new BusinessTrip[5];
       for (int j=0;j<businessTrips.length;j++){
          businessTrips[j]= new BusinessTrip(scanner.next(),scanner.nextDouble(),scanner.nextInt());
         System.out.print("--------");
      }
        for(BusinessTrip businessTrip : businessTrips){
            System.out.println(businessTrip.toString());
            if(businessTrip.getTotal()>m)
                 m=businessTrip.getTotal();
                 if(m>n)n=m;
         }
        contain = businessTrips[0].getDays()+businessTrips[1].getDays();
System.out.print("Max Total = " +n+ "\n"+"Total duration = "+contain);


    }
}
