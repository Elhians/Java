public class EssaiChaineDeCaractere
{
    public static void main(String[] args)
    {
        //essayons les chainesde caractere et leurs fonctionalité
        //On sait que les chaine de caracter sont des types complexes i.e des references contrairement aux types primitifs comme int ou double
        String chaine = "Ma chaine";
        //concantenons 
        chaine = chaine + " de caractere.";
        System.out.println(chaine);
        //essayons quelques fonctions des chaines
        System.out.println(chaine.startsWith("Ma")); //renvoie un booleen true si la chaine commence par "Ma"
        System.out.println(chaine.endsWith("re."));//renvoie un booleen true si la chaine true si fini par "re."
        System.out.println(chaine.replace(".", ""));//remplace "." par "" i.e efface le "."
        System.out.println(chaine.indexOf("a")); //renvoie l'indice de la premier occurrence de "a" l'indicage de la chaine commence par 0 et non par 1
        System.out.println(chaine.length()); //renvoie la longueur de la chaine
        //lorsqu'on met la chaine plus un point ".", On voit toute les methodes disponible
        boolean compare = chaine.equals("chaine"); //renvoie un booleen qui indique si chaine et "OK" sont egale
        boolean compareIgnoreCase = chaine.equalsIgnoreCase("chaine"); //ignore la casse
    }
}