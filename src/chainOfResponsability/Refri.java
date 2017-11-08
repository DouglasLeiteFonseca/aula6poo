package chainOfResponsability;

public class Refri implements Produtos{
		@Override
		public double getPreco() {
			return 2.00;
		}
		
		@Override
		public String getNome() {
			return "Refrigerante";
		}
	
}
