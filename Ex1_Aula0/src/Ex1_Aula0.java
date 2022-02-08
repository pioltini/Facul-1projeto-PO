
public class Ex1_Aula0 {

	public static void main(String[] args) {
		int vetor[] = {1,20,43,65,54,0};
		maiorNumero(vetor);
		menorNumero(vetor);
	}
	
	public static int maiorNumero(int vetor[]) {
		int maior = vetor[0];
		for (int i = 0; i < vetor.length; i++ ) {
			if(vetor[i]>maior) {
				maior = vetor[i];
			}
		}
		System.out.println("maior valor: " + maior);
		return maior;
	}
	public static int menorNumero(int vetor[]) {
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++ ) {
			if(vetor[i]<menor) {
				menor = vetor[i];
			}
		}
		System.out.println("menro valor: " + menor);
		return menor;
	}
}
