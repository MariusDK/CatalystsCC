import java.util.ArrayList;

/**
 * Created by MariusDK on 07.04.2017.
 */
public class TabelLuminozitate {
    private int listaPerechi;

    public int getListaPerechi() {
        return listaPerechi;
    }

    public void setListaPerechi(int listaPerechi) {
        this.listaPerechi = listaPerechi;
    }

    public ArrayList<Integer> getID() {
        return ID;
    }

    public void setID(ArrayList<Integer> ID) {
        this.ID = ID;
    }

    public TabelLuminozitate(int listaPerechi, ArrayList<Integer> ID) {
        this.listaPerechi = listaPerechi;
        this.ID = new ArrayList<>(listaPerechi);

    }

    private ArrayList<Integer> ID;


}
