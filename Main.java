import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int[] a={15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		//System.out.println(search(a,1,0,a.length-1));
		//String[] a={"at","","","","ball","","","car","","","dad","",""};
		//System.out.println(searchR(a,"at",0,a.length-1));
		int[][] a={{0,2,4,6,8},{1,3,5,7,9},{2,4,6,8,10}};
		//search(a,11);

	}
	
	public ArrayList<Htwt> getSeq(ArrayList<Htwt> al){
		Collections.sort(al);
		return longest(al);
	}
	
	public static ArrayList<Htwt> longest(ArrayList<Htwt> al){
		ArrayList<Htwt>[] solutions=new ArrayList[al.size()];
		longest(al,solutions, 0);
		
		ArrayList<Htwt> best=null;
		for(int i=0;i<al.size();i++){
			best=seqWithMax(best, solutions[i]);
		}
		return best;
	}
	
	private static void longest(ArrayList<Htwt> al, ArrayList<Htwt>[] solutions, int i) {
		// TODO Auto-generated method stub
		if(i>=al.size()||i<0)return;
		Htwt element=al.get(i);
		//find the longest sequence we can append element to
		ArrayList<Htwt> best=null;
		for(int j=0;j<i;j++){
			if(al.get(j).isBefore(element)){
				best=seqWithMax(best, solutions[j]);
			}
		}
		ArrayList<Htwt> new_solution=new ArrayList<Htwt>();
		if(best!=null){
			new_solution.addAll(best);
		}
		new_solution.add(element);
		solutions[i]=new_solution;
		longest(al,solutions,i+1);
	}

	public static ArrayList<Htwt> seqWithMax(ArrayList<Htwt> al1, ArrayList<Htwt> al2){
		if(al1==null)return al2;
		if(al2==null)return al1;
		return al1.size()>al2.size()?al1:al2;
	}
	



}
