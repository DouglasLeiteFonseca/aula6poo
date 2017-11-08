package chainOfResponsability;

public class Cliente {
	public static void main(String[] args) {
		Maquina m = new Maquina();
		m.selecionaProduto(new Refri());
		m.pagamento(0.01);
		m.pagamento(0.1);
		m.pagamento(1);
		m.pagamento(1);
		
		m.selecionaProduto(new Salgadinho());
		m.pagamento(1);
		m.pagamento(1.5);
	}
}
