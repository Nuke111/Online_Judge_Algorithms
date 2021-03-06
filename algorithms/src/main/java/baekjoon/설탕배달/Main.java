package baekjoon.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		int answer = -1;
		int min = (int)Math.ceil((double)N/5);
		int max = (int)Math.floor((double)N/3);
//		System.out.println(min);
//		System.out.println(max);
		for(int i=min; i<=max; i++) {
			if(i%2==N%2) {
				answer = i;
				break;
			}
		}
		/*
		while(N!=0) {
			if(N%5==0) {
				N-=5;
				answer++;
			} else if(N%3==0) {
				N-=3;
				answer++;
			} else if(N>5) {
				N-=5;
				answer++;
			} else {
				answer = -1;
				break;
			}
		}
		*/
		
		System.out.println(answer);
		
	}

}
