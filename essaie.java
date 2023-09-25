public class essaie
{
    static public void main (String args[])
    {
        System.out.println("Mon programme de calcul:");

        int somme, a = 4, b = 3;
        double division;
        int multiplication, modulo;
        somme = a + b;
        division = a / b;
        modulo = a % b;
        multiplication = a * b;

        System.out.println("a = " + a);
        System.out.println("b =" +b);
        System.out.println("somme = " + somme);
        System.out.println("multiplication = " +multiplication);
        System.out.println("division = " + division);
        System.out.println("modulo = " +modulo);

        byte y = 8; //==char de c
        System.out.println("y =" +y);
        System.out.println("y+a=" + (y+a));
        System.out.println("y + a*b=" +(y + a*b));
        System.out.printf("y = %d\n", y);
        boolean reponse = false; // un booleen
        System.out.println("reponse = " + reponse);
        char caractere = 'A'; //declarer un caractere
        System.out.println("caractere = " + caractere);
        //4 methodes pour declarer du chaine de caractere
        String chaine="Chaine"; //declarer un chaine une premiere methode
        System.out.println("chaine = " + chaine);
        String phrase;
        phrase ="ceci est ma phrase"; //une deuxieme de declarer une chaine de caractere
        System.out.println ("phrase = " + phrase);
        String prenom = new String(); //une troisieme maniere
        prenom = "Anna";
        System.out.println ("prenom = " + prenom);
        String nom = new String("Ndoye"); //quatrieme methode pour declarer une chaine de caractere
        System.out.println ("nom = " + nom); //+ fait une concantenation des deux chaines de carateres

    }
}