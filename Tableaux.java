import java.util.Arrays;

public class Tableaux {
    static public void main(String args[])
    {
        //declaration d'un tableau de int de 5 elements
        int[] tableau = new int[5]; // les indices du tableau commence de 0 à 5-1=4
        //deux moyens pour initialiser un tableaux par defaut les cases non initialisés sont mise à 0 ou a false(boolean)
        //initialiser element par element
        tableau[0] = 1;
        tableau[1] = 2;
        tableau[2] = 3;
        tableau[3] = 4;
        System.out.println(Arrays.toString(tableau)); //la classe Arrays permet de manipuler un tableau ici avec Arrays.toString[tableau] On peut afficher tout notre tableau
        //deuxieme moyens d'intialiser un tableau
        int[] tableau1 = {8,4,5,3,2,6,7,1,0};
        Arrays.sort(tableau1); //permet de trier le tableau par ordre croissant
        System.out.println(tableau1.length); //length donne la taille du tableau
        System.out.println(Arrays.toString(tableau1));
    }
}
