package baekjoon.N과M.N과M_01;

import java.util.*;
import java.io.*;

public class Main {
	
	static int N, M;
	static ArrayList<Integer> array;
	static LinkedHashSet<ArrayList<Integer>> set;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken());
		array = new ArrayList<>();
		set = new LinkedHashSet<ArrayList<Integer>>();
		
		getNumber(0);
		
		for(ArrayList<Integer> arr: set) {
			for(int i=0; i<arr.size(); i++) {
				bw.write(arr.get(i)+" ");
			}
			bw.write('\n');
		}
		bw.close();
	}
	
	private static void getNumber(int index) {
		if(index==M) 
			set.add(new ArrayList<>(array));
		
		for(int i=1; i<=N; i++) {
			if(array.contains(i)) continue;
			array.add(i);
			getNumber(index+1);
			array.remove(index);
		}
		
	}
}
