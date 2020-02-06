
public class Candies implements Gifts {
	private int c,w;
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public Candies() {
    	System.out.println("In candies constructor");
    }
    public Candies(int n){
        c=n;
    }
	public int Weight_method() {
		w=weight*c; 
		// TODO Auto-generated method stub
		return w;
	}

}
