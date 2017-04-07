import java.util.ArrayList;

/**
 * Created by MariusDK on 07.04.2017.
 */
public class Matrice {
    private int nrOfRows;
    private int nrOfColumns;
    private int[][] a;

    public Matrice(int nrOfRows, int nrOfColumns, int[][] a) {
        this.nrOfRows = nrOfRows;
        this.nrOfColumns = nrOfColumns;
        this.a = a;
    }

    public int getNrOfRows() {

        return nrOfRows;
    }

    public void setNrOfRows(int nrOfRows) {
        this.nrOfRows = nrOfRows;
    }

    public int getNrOfColumns() {
        return nrOfColumns;
    }

    public void setNrOfColumns(int nrOfColumns) {
        this.nrOfColumns = nrOfColumns;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
}
