import java.util.*;
public class Service  
{  
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Hour hour = new Hour();
        Price price = new Price();

        System.out.print("Viewing hours for Netflix: ");
        int hour_netflix2 =  sc.nextInt();

        System.out.print("Viewing hours for prime: ");
        int hour_prime2 = sc.nextInt();

        System.out.print("Viewing hours for hotstar: ");
        int hour_hotstar2 = sc.nextInt();

        int sum = ((hour_netflix2/ hour.get_hour_netflix())*price.get_price_netflix()) + 
                    ((hour_prime2/ hour.get_hour_prime())*price.get_price_prime()) + 
                    ((hour_hotstar2/ hour.get_hour_hotstar())*price.get_price_hotstar());
        System.out.println("Total amount should be paid: " + sum);
        sc.close();
     
    }

}  