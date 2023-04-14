package programa38;

public class Main {

	public static void main(String[] args) {
		String s = "potato apple lemon";
		
		String[] vetor = s.split(" ");
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		
		String v1 = vetor[0];
		String v2 = vetor[1];
		String v3 = vetor[2];
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
