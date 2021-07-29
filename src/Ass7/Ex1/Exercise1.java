package Ass7.Ex1;

import java.io.*;

public class Exercise1 {
    private final static String FILE_URL = "src/Ass7/Ex1/data.txt";
    private static final File file = new File(FILE_URL);
    static void readFile() throws Exception {
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
    static void writeFile() throws Exception{
        String[] data = {"Write file","By ThanhNTH7"};
        OutputStream outputStream = new FileOutputStream(file, true);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        for (String item: data){
            outputStreamWriter.write(item);
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("read File.......\n");
        readFile();
        System.out.println("\nwrite File....\n");
        writeFile();
        System.out.println("read File after wrote......");
        readFile();

    }
}
