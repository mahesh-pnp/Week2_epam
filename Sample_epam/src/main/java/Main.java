import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of gifts:");
		int no_of_gifts=sc.nextInt();
		int []x=new int[no_of_gifts];
		int []x1=new int[no_of_gifts];
		int i1=0;
		while(no_of_gifts>0) {
			System.out.println("Enter the gift "+(i1+1)+" details:");
			System.out.println("Enter no of chocholates");
			int no_of_chocholates=sc.nextInt();
			System.out.println("Enter no of candies");
			int no_of_chandies=sc.nextInt();
			System.out.println("Enter price of each chocolates");
			int chochy_price=sc.nextInt();
			System.out.println("Enter price of2 each candies");
			int candy_price=sc.nextInt();
			Sweets g=new Sweets(no_of_chocholates,no_of_chandies,chochy_price,candy_price);
			x[i1]=g.totalWeight();
			x1[i1]=g.totalPrice();
			i1+=1;
			no_of_gifts-=1;
		}
		Arrays.sort(x);
		System.out.println("Sorted order by weights");
		for(int i=0;i<x.length;i++){
		    System.out.println(x[i]);
		}
		Arrays.sort(x1);
		System.out.println("Sorted order by Price");
		for(int i=0;i<x1.length;i++){
		    System.out.println(x1[i]);
		}
		sc.close();

	}

}
