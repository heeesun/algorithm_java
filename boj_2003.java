import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2003
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt(),M=in.nextInt();
		int successNum=0,sum=0;
		int[] arr=new int[N];
		for(int i=0; i<N; i++){
			arr[i]=in.nextInt();
		}
		for(int i=0; i<N; i++){
			sum=0;
			for(int j=i; j<N; j++){
				sum+=arr[j];
				if(sum>M){
					break;
				}
				else if(sum==M){
					successNum++;
					break;
				}
			}
		}
		System.out.println(successNum);
	}
}
