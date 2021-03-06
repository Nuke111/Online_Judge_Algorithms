package baekjoon.연구소;
import java.io.*;
import java.util.*;
public class buildWall {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean[][] visit;
	static int[][] map;
	public static void main(String[] args) throws Exception {
		map = new int[3][3];
		visit = new boolean[3][3];
		buildWall(0);
		bw.append("끝");
		bw.flush();
	}
	static void buildWall(int count) throws Exception {
		if(count==3) {
			int[][] temp = new int[map.length][];
			for(int i=0; i<map.length; i++) {
				temp[i] = map[i].clone();
				bw.append(Arrays.toString(temp[i])+"\n");
			}
			bw.append("\n");
			return;
		}
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(!visit[i][j] && map[i][j]==0) {
					map[i][j]=1;
					visit[i][j]=true;
					buildWall(count+1);
					visit[i][j]=false;
					map[i][j]=0;
				}
			}
		}
	}	
}
