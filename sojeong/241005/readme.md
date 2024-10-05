# 241005

## 바이러스
https://www.acmicpc.net/problem/2606


```java
package d241005;  
import java.util.*;  
import java.io.*;  
  
public class boj2606 {  
  //컴퓨터 수  
  public static int V;  
  // 연결 수  
  public static int E;  
  
 public static boolean[] visit=new boolean[101];  
 public static int[][] arr=new int[101][101];  
 public static int cnt=0;  
 public static void main(String[] args) throws IOException{  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  V=Integer.parseInt(br.readLine());  
  E=Integer.parseInt(br.readLine());  
 for(int i=0;i<E;i++){  
  StringTokenizer st=new StringTokenizer(br.readLine()," ");  
 int a=Integer.parseInt(st.nextToken());  
 int b=Integer.parseInt(st.nextToken());  
  
  arr[a][b]=1;  
  arr[b][a]=1;  
  }  
  
  System.out.print( DFS(1));  
  
  }  
  
  private static int DFS(int start){  
  visit[start]=true;  
  
 for(int i=1;i<arr.length;i++){  
  if(arr[start][i]==1 && visit[i]==false){  
  cnt+=1;  
  DFS(i);  
  }  
  }  
  return cnt;  
  };  
}
```

## 유기농 배추
https://www.acmicpc.net/problem/1012


```java
package d241005;  
import java.util.*;  
import java.io.*;  
public class boj1012 {  
  
  public static int M;  
 public static int N;  
 public static int K;  
 public static int[][] arr;  
 public static boolean[][] visit;  
  
 public static void main(String[] args) throws IOException{  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
 int num=Integer.parseInt(br.readLine());  
 for(int i=0;i<num;i++){  
  StringTokenizer st=new StringTokenizer(br.readLine()," ");  
  M=Integer.parseInt(st.nextToken());  
  N=Integer.parseInt(st.nextToken());  
  K=Integer.parseInt(st.nextToken());  
  
  arr=new int[51][51];  
  visit=new boolean[51][51];  
 int bug=0;  
 for(int j=0;j<K;j++){  
  StringTokenizer st1=new StringTokenizer(br.readLine()," ");  
 int a=Integer.parseInt(st1.nextToken());  
 int b=Integer.parseInt(st1.nextToken());  
  arr[a][b]=1;  
  }  
  for(int x=0;x<M;x++){  
  for(int y=0;y<N;y++){  
  if(arr[x][y]==1 && !visit[x][y]){  
  bug++;  
  DFS(x,y);  
  }  
  }  
  }  
  System.out.println(bug);  
  }  
  
  }  
  
  
  public static void DFS(int x,int y){  
  int[] dx={0,0,-1,1};  
 int[] dy={-1,1,0,0};  
  
  visit[x][y]=true;  
  
 for(int i=0;i<4;i++){  
  int xn=x+dx[i];  
 int yn=y+dy[i];  
  
 if(xn>=0 && yn>=0 && xn<M && yn<N && arr[xn][yn]==1 && !visit[xn][yn]){  
  DFS(xn,yn);  
  }  
  }  
  }  
  
}
```
