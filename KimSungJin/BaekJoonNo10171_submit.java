import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BaekJoonNo10171_submit {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        sb.append("\\    /\\\n");
        sb.append(" )  ( ')\n");
        sb.append("(  /  )\n");
        sb.append(" \\(__)|\n");

        System.out.println(sb);

        System.out.println("------------");

        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");

        System.out.println("------------");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine(); // 줄 구분자

        bw.write(" )  ( ')");
        bw.newLine();

        bw.write("(  /  )");
        bw.newLine();

        bw.write(" \\(__)|");

        bw.flush();
        bw.close();
    }

}
