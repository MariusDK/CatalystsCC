/**
 * Created by MariusDK on 07.04.2017.
 */
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by MariusDK on 30.03.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        CitireFisier cf= new CitireFisier();
        String line=cf.citireFiser();
        String[] list=line.split(" ");

        int mat[][]=new int[12][20];
        int k=0;
        for (int i = 0 ; i < 12; i++) {
            for (int j = 0 ; j < 20; j++)
            {

                mat[i][j]=Integer.parseInt(list[k]);
                k++;
            }
        }


        Matrice m=new Matrice(12,20,mat);

        HashMap<Integer,Integer> tabel=new HashMap<Integer,Integer>();
        tabel.put(1,1);
        tabel.put(2,7);
        int[] sir;

        Algoritm a=new Algoritm();
        sir=a.detectareLuminozitate(tabel,m);
        //int deltaY=a.deltaY(m);
        //int deltaX=a.deltaX(m);
        for (int i=0;i<sir.length;i++) {
            System.out.print(sir[i]+" ");
        }
    }

}
