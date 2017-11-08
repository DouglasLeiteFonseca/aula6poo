package chainOfResponsability;

public class Slot25 extends Slot{
	private double valor = 0.25;
	
	@Override 
	public double verificaMoeda(double valor){
		if (this.valor == valor){
			return this.valor;
		}else{
			return this.getProximo().verificaMoeda(valor);
		}
	}
}
