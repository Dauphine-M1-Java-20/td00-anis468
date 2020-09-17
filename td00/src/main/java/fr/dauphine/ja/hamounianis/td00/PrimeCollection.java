package fr.dauphine.ja.hamounianis.td00;
import java.util.*;
/**
 * Hello world!
 *
 */
public class PrimeCollection 
{  
	ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<Integer>();
	}
	
	public void initRandom(int n,int m) {
		for(int i=0;i<n;i++)
			numbers.add((int)(Math.random()*m));
	}
	
	private boolean isPrime(int p) {
		for(int i=2;i<Math.sqrt(p)+1;i++) {
			if(p%i==0) return false;
		}
		return true;
	}
	
	public void printPrimes() {
		for(int e: this.numbers) {
			if(isPrime(e))
				System.out.println(e+" est premier");
		}
	}
	
	
    public static void main( String[] args )
    {
    PrimeCollection pc = new PrimeCollection();
    pc.initRandom(100, 1000);
    pc.printPrimes();
    }
}
