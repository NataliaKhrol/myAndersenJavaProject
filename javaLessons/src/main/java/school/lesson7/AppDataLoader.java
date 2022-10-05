package school.lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class AppDataLoader {
    public void save(AppData appData, File file) throws FileNotFoundException {

        String div = ";";
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < appData.getHeader().length; i++) {
            String s = appData.getHeader()[i];
            pw.write(s);
            pw.write(div);
        }pw.write("\n");

        int[][] matrix = appData.getData();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int y = matrix[i][j];
                String str = Integer.toString(y);
                pw.write(str);
                pw.write(div);
            }
            pw.write("\n");
        }
        pw.close();

    }

    public AppData load(File file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);

        //  File file = new File();
        //pw.write(Arrays.toString(header));
        //pw.write(Arrays.deepToString(data));
        // pw.write(sb2.toString());
        //pw.close();

        //if(file.exists()){
        return null;
    }
}
