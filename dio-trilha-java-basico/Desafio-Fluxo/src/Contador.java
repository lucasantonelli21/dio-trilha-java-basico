import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = input.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm>parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		int contagem = parametroDois - parametroUm;
		for(int i=0;i<contagem+1;i++)
            System.out.println(contagem);
	}
}