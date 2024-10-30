package ch2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class p45 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入5個人的分數");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[]score=new int[5];
		for(int i=0;i<5;i++) {
			String str1=br.readLine();
			score[i]=Integer.parseInt(str1);
		}
		for(int s=0;s<score.length;s++) {
			for(int t=s+1;t<score.length;t++) {
				if(score[t]>score[s]) {
					int temp=score[s];
					score[s]=score[t];
					score[t]=temp;
				}
			}
		}
		for(int j=0;j<5;j++) {
			System.out.println("第"+(j+1)+"名的分數是"+score[j]);
		}

	}

}
