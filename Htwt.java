
public class Htwt implements Comparable{
	
	int weight,height;
	public Htwt(int height, int weight){
		this.height=height;
		this.weight=weight;
	}

	
	public boolean isBefore(Htwt other){
		if(this.height<other.height && this.weight<other.weight)return true;
		return false;
	}

	@Override
	public int compareTo(Object s) {
		// TODO Auto-generated method stub
		Htwt second=(Htwt)s;
		if(this.height!=second.height){
			return ((Integer)this.height).compareTo(second.height);
		}else{
			return ((Integer)this.weight).compareTo(second.weight);
		}
		
	}
	

}
