import java.util.Scanner;
import java.text.DecimalFormat;

public class calculoLucro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double I, Pi, Pf, Pb, Pn;
Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o pre�o inicial ");
		Pi = ler.nextDouble();
		//Pre�o inicial da criptomoeda
		System.out.println("Entre com a quantiidade de dinheiro a ser investido ");
		I = ler.nextDouble();
		//Valor do investimento
		System.out.println("Entre com o pre�o final ");
		Pf = ler.nextDouble();
		//Pre�o final da criptomoeda
		
		Pb = I * ((Pf / Pi) - 1);
		//Lucro bruto (antes do pagamento das taxas)
		Pn = Pb - (((1.39 * Pb) / 100) + 1.89);
		//Lucro liquido (Depois da retirada das taxas)
		//1.39 e 1.89 s�o as taxas a serem pagas
		
		//System.out.printf("O lucro bruto �: R$ %.2f" , Pr); 
		                  //Ou
		
		System.out.println("O lucro bruto �: R$ " + new DecimalFormat(".##").format(Pb));
		System.out.println("O lucro liquido �: R$ " + new DecimalFormat(".##").format(Pn));
		
	}

}

	


