package school.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppDataLoader {
    public void save(AppData appData, File file) throws FileNotFoundException {

        String div = ";";
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < appData.getHeader().length; i++) {
            String s = appData.getHeader()[i];
            pw.write(s);
            pw.write(div);
        }
        pw.write("\n");

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

    public AppData load(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String ln = reader.readLine();
        List<String> q = new ArrayList<>();

        while (ln != null) {
            q.add(ln);
            ln = reader.readLine();
        }
        reader.close();

        AppData result = new AppData();
        String[] newArray = q.get(0).split(";");
        result.setHeader(newArray);

        int[][] matrixNew = new int[q.size() - 1][];
        for (int i = 1; i < q.size(); i++) {
            String[] newArray2 = q.get(i).split(";");

            int[] numbers = new int[newArray2.length];
            for (int j = 0; j < newArray2.length; j++) {
                numbers[j] = Integer.parseInt(newArray2[j]);

            }
            matrixNew[i - 1] = numbers;
        }
        result.setData(matrixNew);

        return result;

    }
}

//  File file = new File();
//pw.write(Arrays.toString(header));
//pw.write(Arrays.deepToString(data));
// pw.write(sb2.toString());
//pw.close();

//if(file.exists()){
