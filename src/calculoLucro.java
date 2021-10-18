import java.util.Scanner;
import java.text.DecimalFormat;

public class calculoLucro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double I, Pi, Pf, Pb, Pn;
Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o preço inicial ");
		Pi = ler.nextDouble();
		//Preço inicial da criptomoeda
		System.out.println("Entre com a quantiidade de dinheiro a ser investido ");
		I = ler.nextDouble();
		//Valor do investimento
		System.out.println("Entre com o preço final ");
		Pf = ler.nextDouble();
		//Preço final da criptomoeda
		
		Pb = I * ((Pf / Pi) - 1);
		//Lucro bruto (antes do pagamento das taxas)
		Pn = Pb - (((1.39 * Pb) / 100) + 1.89);
		//Lucro liquido (Depois da retirada das taxas)
		//1.39 e 1.89 são as taxas a serem pagas
		
		//System.out.printf("O lucro bruto é: R$ %.2f" , Pr); 
		                  //Ou
		
		System.out.println("O lucro bruto é: R$ " + new DecimalFormat(".##").format(Pb));
		System.out.println("O lucro liquido é: R$ " + new DecimalFormat(".##").format(Pn));
		
	}

}

	


