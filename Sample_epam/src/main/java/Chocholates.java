
public class Chocholates implements Gifts {
    private int c,w;
    public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Chocholates() {
    	System.out.println("In chocholates constructor");
    }
    public Chocholates(int n){
        c=n;
    }
   public int Weight_method() {
	   w=weight*c; 
		// TODO Auto-generated method stub
		return w;
	}

}
