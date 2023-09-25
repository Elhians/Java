import java.util.Scanner;

public class exoEquationScdDegre {
    public static void main (String [] args){

        final int zero = 0;
        
        System.out.println("Entrez votre nom:");
        String name = new String();
        Scanner entreeName = new Scanner(System.in);

        name = entreeName.nextLine();

        double b = 0, a = 0, c = 0;
        double delta = 0;
        System.out.println("Entrez a:");
        Scanner entreeA = new Scanner( System.in);

        a = entreeA.nextDouble();

        Scanner entreeB = new Scanner(System.in);
        System.out.println("Entrez b:");

        b = entreeB.nextDouble();

        Scanner entreeC =  new Scanner(System.in);
        System.out.println("Entrez c:");

        c = entreeC.nextDouble();
        delta = b*b - 4*a*c;

        System.out.println("L'equation est " +a +"x² + " + b +"x + " + c + " = " +zero);
        System.out.println(name + " delta = b² - 4ac = " + delta);
    }
}
