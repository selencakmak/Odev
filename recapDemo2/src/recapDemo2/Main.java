package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,1.4,5.6};
		double total=0;
		double max= myList[0];
		
		for(double number: myList) {
			if(max<number) {
				max=number;
			}
			System.out.println(number);
			total=total+number;
		}
		
	System.out.println("Toplam = "+ total);	
	System.out.println("TMax = "+ max);	

	}

}