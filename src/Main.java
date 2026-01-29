import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    static void main() throws IOException {

        var occupants = new ArrayList<String>();
        occupants.add("Fola");
        occupants.add("Sola");
        occupants.add("Demola");
        occupants.add("Ola");

        var iterator= occupants.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}


