import java.io.*;

public class task5 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\MyFile1.txt"),"cp1251"));
            out = new PrintWriter("D:\\MyFile2.txt", "cp1251");
            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.flush();
            out.close();
        }}
}