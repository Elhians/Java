import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args){

        Scanner entree = new Scanner(System.in);
        System.out.println("Enrez un nombre:");
        int nombre = entree.nextInt();
        String reponse = new String("");

        if(nombre % 3 == 0 && nombre % 5 == 0)
            reponse = "FizzBuzz";
        else if (nombre % 5 == 0)
        reponse = "Buzz";
        else if (nombre % 3 == 0)
        reponse = "Fizz";
        else
            reponse = reponse + nombre;
        
            System.out.println(reponse);

    }
}
