/**
 * Created by MariusDK on 07.04.2017.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by MariusDK on 30.03.2017.
 */
public class CitireFisier {
    public String citireFiser()
    {
        String input="";
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\MariusDK\\IdeaProjects\\CatalystsCC\\src\\Fisier.txt"));
            String line = null;
            line = bufReader.readLine();

            while (line != null) {
                input=input+line;
                line = bufReader.readLine();


            }
            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  input;
    }
}
