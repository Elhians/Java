public class ClassMath {

    int result = Math.round(3.14F); //round arrondis le resultat donc ici on aura 3
    int nombre1 = (int) Math.ceil(1.14); //ceil donne le plus petit entier superieur ou egale au nombre donc ici va ranvoyer 2 retourne un double
    int nombre2 = (int) Math.floor(1.14); // floor donne le plus grand entier inferieur ou egale au nombre donc ici renvoie 1 retourne un double
    int minimum = Math.min(3,4); //affiche le minimum entre 3 et 4
    int maximum = Math.max(3,4); //affiche le maximum entre 3 et 4
    double nombreAleatoire1 = Math.random(); // renvoie un nombre aleatoire compris entre 0 et 1, un double ex: 0,88666344553322
    int nombreAleatoire2 = (int) Math.random() * 100; // renvoie un nombre aleatoire compris entre 0 et 100, on a covertis en int ex: 45
    int puissance =(int) Math.pow(4,2); //pow donne la puissance de 4²
}