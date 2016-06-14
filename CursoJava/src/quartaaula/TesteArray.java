package quartaaula;

public class TesteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]idades = new int[10];
		for(int i = 0; i<10;i++){
			idades[i]=i*2;
			
		}
		// imprime todo o array 
		for(int x : idades){
			System.out.println(x);
			
		}

		
		
	}

}
