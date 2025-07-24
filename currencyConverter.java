import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Currency Converter");
        System.out.println("1.USD to Rupee");
        System.out.println("2.Rupee to USD");
        System.out.println("3.Euro to Rupee");
        System.out.println("4.Rupee to Euro");
        System.out.print("Enter your choice(1 or 2 or 3 or 4):");
        int choice=scanner.nextInt();


        if(choice==1){
            System.out.println("Enter the Amount in USD: ");
            double USD=scanner.nextDouble();
            double Rupee=usdToRupee(USD);
            System.out.println("Converted amount in Rupee:  "+  Rupee);

        }
        else if(choice==2){
            System.out.println("Enter the Amount in Rupee:" );
            double Rupee=scanner.nextDouble();
            double USD=RupeeToUsd(Rupee);
            System.out.println("Converted amount in USD: " +USD);


        }
        else if(choice==3){
            System.out.println("Enter the Amount in EURO:");
            double EURO=scanner.nextDouble();
            double Rupee=euroToRupee(EURO);
            System.out.println("Converted amount in USD:" + Rupee);

        }
        else if(choice==4){
            System.out.println("Enter the Amount in Rupee:");
            double Rupee=scanner.nextDouble();
            double EURO=RupeeToEuro(Rupee);
            System.out.println("Converted amount in EURO " + EURO);

        }
        else{
            System.out.println("Invalid choice.Please select 1 or 2 or 3 or 4");

        }
        scanner.close();

    }
    public static double usdToRupee(double USD){
        return USD *85.72 ;

    }
    public static double RupeeToUsd(double Rupee){
         return Rupee * 0.012;
    }
    public static double euroToRupee(double EURO){
        return EURO * 100.56;

    }
    public static double RupeeToEuro(double Rupee){
        return Rupee * 0.0099;
    }

    
}
