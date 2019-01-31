import java.util.*;
public class Sort_Algorithm {
	public int[] solution(int[] array, int[][] commands) {
        int champ,challenger;
        int[] answer= new int[commands.length];
		for(int x=0;x<commands.length;x++) {
			int i=commands[x][0];
			int j=commands[x][1];
			int k=commands[x][2];
			List<Integer> list=new ArrayList<>();
			for(int y=i-1;y<=j-1;y++) {
				list.add(array[y]);
			}
			
			j=list.size()-1;
			while(j!=0) {
			for(int z=0; z<=j-1; z++) {
					challenger=list.get(z+1);
					champ=list.get(z);
					if(champ-challenger>0) {
						list.set(z+1, champ);
						list.set(z, challenger);
					}
			}
			j--;
		}
			answer[x]=list.get(k-1);
		}
		return answer;
    }
	public static void main(String[] args) {
		int[] array= {2,8,4,6,1,3,9,5};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer= new Student().solution(array, commands);
		System.out.print(Arrays.toString(answer));

	}

}
