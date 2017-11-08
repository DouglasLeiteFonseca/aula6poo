package chainOfResponsability;

public class Slot50 extends Slot{
	private double valor = 0.50;
	
	@Override 
	public double verificaMoeda(double valor){
		if (this.valor == valor){
			return this.valor;
		}else{
			return this.getProximo().verificaMoeda(valor);
		}
	}
}
