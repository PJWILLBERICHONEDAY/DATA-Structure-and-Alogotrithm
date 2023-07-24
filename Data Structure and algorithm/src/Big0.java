import java.lang.reflect.Array;

public class Big0 {
	
public static void main(String[] args) {
	long tame=System.nanoTime();
	String[] arr= {"Nemo","Nemo","Ranta","Nepa","shrunk",};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]=="Nemo") {
			System.out.println("Nemo Found");
		}
	}
	long time=System.nanoTime();
	
	long finaltame=time-tame;
	
	System.out.println("The time to found nemo is " + finaltame+ " nano seconds" );


	
}
	
}

