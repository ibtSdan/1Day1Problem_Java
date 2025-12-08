import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int day = Integer.parseInt(br.readLine());
        int kor = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        int maxKor = Integer.parseInt(br.readLine());
        int maxMath = Integer.parseInt(br.readLine());

        int temp1 = kor%maxKor==0 ? kor/maxKor : kor/maxKor+1;
        int temp2 = math%maxMath==0 ? math/maxMath : math/maxMath+1;

        bw.write((day-Math.max(temp1, temp2)+"\n"));
        bw.flush();
    }
}
