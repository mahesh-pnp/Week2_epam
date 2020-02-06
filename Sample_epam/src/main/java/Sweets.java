
public class Sweets {
	int Choc,cha,t,chop,canp;
    Sweets(int ch,int ca,int chp,int cap){
        cha=ca;
        Choc=ch;
        chop=chp;
        canp=cap;
    }
    int totalWeight(){
        Chocholates ch1=new Chocholates(Choc);
        Candies c=new Candies(cha);
        t=ch1.Weight_method()+c.Weight_method();
        
        return t;
    }
    int totalPrice() {
    	t=Choc*chop+cha*canp;
    	return t;
    }

}
