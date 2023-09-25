import java.util.Arrays;

public class Matrice {
    
    public static void main(String[] args){

        int[][][] matrice3 = new int[3][3][3]; //tableau à tois dimension 
        matrice3[0][0][0] = 1; //la premiere case de notre tableau est initialisé à 1 le rest est donc à 0
        int[][] matrice2 = {{1,2,3}, {4,5,6}, {7,8,9}};//tableau à deux dimension initialisé

        System.out.println(Arrays.deepToString(matrice2));
        System.out.println(Arrays.deepToString(matrice3));
    }
}
