package d240903;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String str[] = new String[10000];
        Stack<Character> strings = new Stack<>();
        for (int i = 0; i < a; i++) {
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(b.readLine());
            int c = 0;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while (st.hasMoreTokens()) {

                str[c] = st.nextToken();
                for (int tep = 0; tep < str[c].length(); tep++) {
                    strings.push(str[c].charAt(tep));
                }

                for (int tep = 0; tep < str[c].length(); tep++) {
                    bw.write(strings.pop());
                    bw.flush();
                }
                if(st.hasMoreTokens()){
                    bw.write(" ");
                    bw.flush();
                }
                c += 1;
            }
            bw.write("\n");
            bw.flush();
        }
    }

}
