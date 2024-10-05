# 241002

## DFS와 BFS
https://www.acmicpc.net/problem/1260


```java
package d241002;  
  
import java.io.*;  
import java.io.IOException;  
import java.util.*;  
  
public class boj1260 {  
  public static void main(String[] args) throws IOException {  
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
  StringTokenizer st = new StringTokenizer(br.readLine(), " ");  
 int n = Integer.parseInt(st.nextToken());  
 int m = Integer.parseInt(st.nextToken());  
 int v = Integer.parseInt(st.nextToken());  
  Map<Integer, List<Integer>> temp = new HashMap<>();  
 for (int i = 0; i < m; i++) {  
  StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");  
 int a = Integer.parseInt(st1.nextToken());  
 int b = Integer.parseInt(st1.nextToken());  
 if (temp.containsKey(a)) {  
  temp.get(a).add(b);  
  }  
  if (temp.containsKey(b)) {  
  temp.get(b).add(a);  
  }  
  if (!temp.containsKey(a)) {  
  temp.put(a, new ArrayList<>());  
  temp.get(a).add(b);  
  }  
  if (!temp.containsKey(b)) {  
  temp.put(b, new ArrayList<>());  
  temp.get(b).add(a);  
  }  
  }  
  for (Map.Entry<Integer, List<Integer>> entry : temp.entrySet()) {  
  Collections.sort(entry.getValue());  
  }  
  
  DFS(temp, v);  
  System.out.println();  
  BFS(temp, v);  
  }  
  
  private static void DFS(Map<Integer, List<Integer>> temp, int start) {  
  if (!temp.containsKey(start)) {  
  System.out.print(start);  
 return;  }  
  Stack<Integer> stack = new Stack<>();  
  List<Integer> visit = new ArrayList<>();  
  
  stack.add(start);  
  
 while (!stack.isEmpty()) {  
  int n = stack.pop();  
  //이미 방문했으면  
  if (!visit.contains(n)) {  
  visit.add(n);  
  List<Integer> var = temp.get(n);  
  
 for (int i = var.size() - 1; i >= 0; i--) {  
  stack.add(var.get(i));  
  
  }  
  }  
  }  
  for (var a : visit) {  
  System.out.print(a + " ");  
  }  
  }  
  
  private static void BFS(Map<Integer, List<Integer>> temp, int start) {  
  if (!temp.containsKey(start)) {  
  System.out.println(start);  
 return;  }  
  Queue<Integer> queue = new LinkedList<>();  
  List<Integer> visit = new ArrayList<>();  
  queue.add(start);  
 while (!queue.isEmpty()) {  
  int n = queue.poll();  
  
 if (!visit.contains(n)) {  
  visit.add(n);  
  List<Integer> var = temp.get(n);  
 for (int i = 0; i <= var.size() - 1; i++) {  
  queue.add(var.get(i));  
  
  }  
  }  
  }  
  for (var a : visit) {  
  System.out.print(a + " ");  
  }  
  }  
}

```

1. 인접행렬로 푼 코드

```
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
  if(visit[i]==false  && arr[temp][i]==1){  
  queue.add(i);  
  visit[i]=true;  
  }  
  }  
  }  
  }  
}

```
