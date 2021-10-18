import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BaekJoonNo10172_submit {
    public static void main(String[] args) throws IOException {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

        System.out.println("---------------");

        StringBuffer sb = new StringBuffer();

        sb.append("|\\_/|\n");
        sb.append("|q p|   /}\n");
        sb.append("( 0 )\"\"\"\\\n");
        sb.append("|\"^\"`    |\n");
        sb.append("||_/=\\\\__|");

        System.out.println(sb);

        System.out.println("---------------");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|");
        bw.newLine();
        bw.write("|q p|   /}");
        bw.newLine();
        bw.write("( 0 )\"\"\"\\");
        bw.newLine();
        bw.write("|\"^\"`    |");
        bw.newLine();
        bw.write("||_/=\\\\__|");

        bw.flush();
        bw.close();
    }
}
