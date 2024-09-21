# 240921

## 01타일
https://www.acmicpc.net/problem/1904
```java
package d240921;  
import java.io.*;  
  
public class boj1904 {  
  public static void main(String[] args) throws IOException{  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
 int n=Integer.parseInt(br.readLine());  
 int arr[]=new int[n+2];  
  arr[1]=1;  
  arr[2]=2;  
 for(int i=3;i<=n;i++){  
  arr[i]=(arr[i-1]+arr[i-2])%15746;  
  }  
  System.out.print(arr[n]%15746);  
  }  
}

```

## 정수 삼각형
https://www.acmicpc.net/problem/1932
```java
package d240921;  
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class boj1932 {  
  public static void main(String[] args) throws IOException {  
  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
 int n=Integer.parseInt(br.readLine());  
 int arr[][]=new int[501][501];  
  
 for(int i=1;i<=n;i++){  
  StringTokenizer st=new StringTokenizer(br.readLine()," ");  
 for(int j=1;j<=i;j++){  
  arr[i][j]= Integer.parseInt(st.nextToken());  
  }  
  }  
  
  
  for(int i=1;i<=n;i++){  
  for(int j=1;j<=n;j++) {  
  arr[i][j]=arr[i][j]+Math.max(arr[i-1][j],arr[i-1][j-1]);  
  }  
  }  
  
  int max=arr[n][n];  
 for(int i=1;i<=n;i++){  
  if(max<=arr[n][i]){  
  max=arr[n][i];  
  }  
  }  
  System.out.print(max);  
  }  
}

```

## 2×n 타일링
https://www.acmicpc.net/problem/11726
```java
package d240921;  
  
import java.io.*;  
  
public class boj11726 {  
  public static void main(String[] args) throws IOException {  
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
 int n = Integer.parseInt(br.readLine());  
 int arr[] = new int[n + 1];  
  arr[1] = 1;  
  arr[2] = 2;  
 for (int i = 3; i <= n; i++) {  
  arr[i] = (arr[i - 1] +  arr[i - 2])%10007;  
  }  
  int result = arr[n] % 10007;  
  System.out.print(result);  
  }  
}
```


다이나믹 프로그래밍에 대해 학습했습니다.
