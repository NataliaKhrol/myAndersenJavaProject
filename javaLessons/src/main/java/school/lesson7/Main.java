package school.lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("myFirstFile.csv");
        AppDataLoader loader = new AppDataLoader();
        AppData appData = new AppData();
        loader.save(appData, file);

        //  AppData data = loader.load(file);
    }
}



/*
String[] header = new String[]{"Value1;", "Value2;", "Value3;"};
split
    int[][] data = {{100, 200, 123},
            {300, 400, 500}};


    public static void main(String[] args) throws FileNotFoundException {


   StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("A");
        strBuilder.append("B");
        strBuilder.append("C");
        System.out.println(strBuilder);

        File file = new File("C:\\Users\\NKhrol\\IdeaProjects\\HomeWork\\HomeWork\\src");
        System.out.println(file.exists());
        System.out.println(file.getName());

         StringBuilder sb = new StringBuilder();
   sb.append("Value1;");
        sb.append("Value2;");
         sb.append("Value3;");


        StringBuilder sb1 = new StringBuilder();
        sb1.append("100;");
        sb1.append("200;");
        sb1.append("300;");

        StringBuilder sb2 = new StringBuilder();
        sb1.append("400;");
        sb1.append("500;");
        sb1.append("600;");

        System.out.println(Arrays.toString(header));
        System.out.println(Arrays.deepToString(data));
     System.out.println(sb2);


           String [] sb2 = "400,500,600".split(";");
           System.out.println(Arrays.toString(sb2));

        PrintWriter pw = new PrintWriter(new File("testVersion.csv"));
        pw.write(Arrays.toString(header));
        pw.write(Arrays.deepToString(data));
         pw.write(sb2.toString());
        pw.close();

        Csv.Reader reader = new Csv.Reader (new FileReader("testVersion.csv")).delimiter(';');
        reader.header.data.newLine().close();


    }
}

   String j = "GGGG";

   PrintWriter pw = new PrintWriter(new File("testVercion.csv")))

  {

   int[][] data = { {100, 200, 123},
              {300, 400, 500}};
   data = createCsvDataSimple()

    }

 */
