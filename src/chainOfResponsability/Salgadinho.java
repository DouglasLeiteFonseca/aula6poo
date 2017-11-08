package chainOfResponsability;

public class Salgadinho implements Produtos{
	@Override
	public double getPreco(){
		return 2.50;
	}
	
	@Override
	public String getNome(){
		return "Chips";
	}
}
