package chainOfResponsability;

public abstract class Slot {
	private Slot proximo;
	
	public abstract double verificaMoeda(double valor); 
	public void setProximo(Slot p){
		if(this.proximo == null){
			this.proximo = p;
		}else{
			this.proximo.setProximo(p);
		}
	}
	public Slot getProximo(){
		return this.proximo;
	}
}
