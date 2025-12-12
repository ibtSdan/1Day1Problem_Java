import java.io.*;
import java.util.*;

public class Main {
    static class Member {
        int age;
        String name;
        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Member(age, name));
        }
        
        list.sort((a, b) -> a.age - b.age);
        
        for (Member m : list) {
            bw.write(m.age+" "+m.name+"\n");
        }
        bw.flush();
    }
}
