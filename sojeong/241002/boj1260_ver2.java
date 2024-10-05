package d241002;
import java.io.*;
import java.util.*;
public class boj1260_ver2 {
    public static int N;
    public static int M;
    public static int V;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
         N=Integer.parseInt(st.nextToken());
         M=Integer.parseInt(st.nextToken());
         V=Integer.parseInt(st.nextToken());
        int[][] arr=new int[1001][1001];

        boolean[] visit=new boolean[1001];
        for(int i=0;i<M;i++){
            StringTokenizer st1=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st1.nextToken());
            int b=Integer.parseInt(st1.nextToken());
            arr[a][b]=1;
            arr[b][a]=1;
        }
        DFS(V,arr,visit);
        Arrays.fill(visit,false);
        System.out.println();
        BFS(V,arr,visit);
    }

    private static void DFS(int start,int[][] arr,boolean[] visit){
        visit[start]=true;
        System.out.print(start+" ");
        for(int i=1;i<=N;i++){
            if(arr[start][i]==1 && visit[i]==false){
                DFS(i,arr,visit);
            }
        }
    }

    private static void BFS(int start,int[][] arr,boolean[] visit){
        Queue<Integer> queue=new LinkedList<>();
        visit[start]=true;
        queue.add(start);
        while (!queue.isEmpty()){
            int temp=queue.poll();
            System.out.print(temp+" ");
            for(int i=1;i<arr.length;i++){
                if(visit[i]==false && arr[temp][i]==1){
                    queue.add(i);
                    visit[i]=true;
                }
            }
        }
    }
}
