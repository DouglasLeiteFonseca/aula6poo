package chainOfResponsability;

public class Maquina {
	Slot slot;
	Produtos p;
	double valorTotal;
	
	
	public Maquina(){
		slot = new Slot1();
		slot.setProximo(new Slot1());
		slot.setProximo(new Slot5());
		slot.setProximo(new Slot10());
		slot.setProximo(new Slot25());
		slot.setProximo(new Slot50());
		slot.setProximo(new Slot100());
	}
	
	public void selecionaProduto(Produtos p){
		this.p = p;
	}
	public void pagamento(double valor){
		
			try{
				if(this.p != null){
					valorTotal += slot.verificaMoeda(valor);
					if(valorTotal >= p.getPreco()){
						System.out.println("Você comprou o produto: "+ (p.getNome()));
						if(valorTotal > p.getPreco()){
							System.out.println("Seu troco é: "+ (valorTotal - p.getPreco()) );
						}
						selecionaProduto(null);
						valorTotal = 0;
					}else{
						System.out.println("Valor restante para comprar o produto ("+p.getNome()+") " + (p.getPreco() - valorTotal) );
					}
					
				}else{
					System.out.println("Escolha o produto antes de efetuar o pagamento");
				}
			}catch(Exception e){
				System.out.println("Moeda de "+valor+" não é aceita");
			}
			
			
			
	}
}