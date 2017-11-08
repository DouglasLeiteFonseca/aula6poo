package chainOfResponsability;

public class Slot10  extends Slot{
	private double valor = 0.10;
	
	@Override 
	public double verificaMoeda(double valor){
		if (this.valor == valor){
			return this.valor;
		}else{
			return this.getProximo().verificaMoeda(valor);
		}
	}
}
