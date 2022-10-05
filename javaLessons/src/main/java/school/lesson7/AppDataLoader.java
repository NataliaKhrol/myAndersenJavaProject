package school.lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class AppDataLoader {
    public void save(AppData appData, File file){

    }
    public AppData load(File file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);
      //  PrintWriter pw = new PrintWriter(new File("testVersion.csv"));
      //  File file = new File();
        //pw.write(Arrays.toString(header));
        //pw.write(Arrays.deepToString(data));
        // pw.write(sb2.toString());
        //pw.close();

        return null;
    }
}
