package ch2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
public class p47 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("請輸入5個人的分數");
		Integer score[]=new Integer[5];
		for(int i=0;i<score.length;i++) {
			String str=br.readLine();
			score[i]=Integer.parseInt(str);
		}
		Arrays.sort(score,Collections.reverseOrder());
		for(int i=0;i<score.length;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+score[i]);
		}
	}

}
