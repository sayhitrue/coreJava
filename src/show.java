import java.io.*;

import static java.io.File.separator;

public class show {
    public static void main(String[] args) throws IOException{
        String str = "流输出";
        StringReader inStr = new StringReader(str);
        StringWriter outStr = new StringWriter();
        /**
         * 注意Reader是字符操作，这边要用char，inputstream是字节操作，使用byte
         */
        char[] temp = new char[1];
        while (inStr.read(temp)!=-1){
            outStr.write(temp);
        }
        inStr.close();
        outStr.close();
        System.out.print(outStr.toString()+separator);
        //test123

    }
}
