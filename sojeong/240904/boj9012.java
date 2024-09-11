package d240904;
import java.io.*;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            Stack<Character> stack=new Stack<>();
            String temp=br.readLine();
            for(int j=0;j<temp.length();j++){
                char ch=temp.charAt(j);
                if(ch=='('){
                    stack.push(ch);
                }
                else{
                    if(stack.empty()){
                        stack.push(ch);
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
