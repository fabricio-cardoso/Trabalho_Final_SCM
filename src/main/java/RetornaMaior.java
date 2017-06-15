import java.util.Scanner;


public class RetornaMaior {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int num1, num2;
		System.out.println("Digite um numero: ");
		num1 = in.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = in.nextInt();
		
		System.out.println("O maior numero entre "+num1+ " e " +num2+" é: " +maior(num1, num2));
		System.out.println("Obrigado por utilizar o programa!");
		System.out.println("Testando ações de build");
	}
	public static int maior(int a,int b){
		if(a > b){
			return a;
		}else{
			return b;
		}
	}

}
