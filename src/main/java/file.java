import java.io.File;
import java.io.IOException;

public class file {

    public static void main(String[] args) throws IOException {

        File file=new File("d:"+File.separator+"demo"+File.separator+
                "hello"+File.separator+"yootk"+File.separator+"test.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        System.out.println(file.createNewFile());
    }
}
