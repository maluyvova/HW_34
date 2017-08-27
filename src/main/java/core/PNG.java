package core;

public class PNG {
int lenght = 0, result = 0;
static int max = 100;
public static void main (String [] args){
	for (int i = 2; i<=max;i++){
		System.out.println("{" + i + "," + PrimeNumberChecker.validate(i) + "}" + (i<max?",":""));
		
	}
}
}
