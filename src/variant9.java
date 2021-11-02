import java.io.*;
public class variant9 {
    public static void main(String[]args) throws IOException{
        InputStream in = null;
        Reader file = null;
        BufferedReader bufread = null;
        OutputStream out =  null;
        Writer writer = null;
        try{
            in = new FileInputStream("C:\\Java\\in.txt");
            file = new InputStreamReader(in,"utf-8");
            bufread = new BufferedReader(file);
            File f2 = new File("C:\\Java\\out.txt");
            f2.createNewFile();
            out = new FileOutputStream(f2);
            writer = new OutputStreamWriter(out, "utf-8");
            if(f2.exists()){
                String line = " ";
                String [] words;

                while((line = bufread.readLine()) != null){
                    words = line.split(" ");
                    for(int i = 0; i < words.length; i++){
                        if (words[i].charAt(0) == words[0].charAt(0)){
                            writer.append(words[i] + " ");
                        }
                        }

                }
            }
        }
        catch (IOException e){
            System.out.println("Ошибка: "+ e);
        }
        finally {
            in.close();
            file.close();
            bufread.close();
            writer.flush();
            writer.close();
            out.close();
        }
    }
}