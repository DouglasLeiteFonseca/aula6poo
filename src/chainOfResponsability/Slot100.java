package chainOfResponsability;

public class Slot100 extends Slot{
	private double valor = 1.00;
	
	@Override 
	public double verificaMoeda(double valor){
		if (this.valor == valor){
			return this.valor;
		}else{
			return this.getProximo().verificaMoeda(valor);
		}
	}
}
