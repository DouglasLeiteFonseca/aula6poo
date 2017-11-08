package strategy.diaSemana;

public class Cliente {
	public static void main(String[] args) {
		MensagemDoDia msg = new MensagemDoDia(new Domingo());
		msg.mensagem();
		
		MensagemDoDia msg1 = new MensagemDoDia(new Segunda());
		msg1.mensagem();
		
		MensagemDoDia msg2 = new MensagemDoDia(new Terca());
		msg2.mensagem();
		
		MensagemDoDia msg3 = new MensagemDoDia(new Quarta());
		msg3.mensagem();
		
		MensagemDoDia msg4 = new MensagemDoDia(new Quinta());
		msg4.mensagem();
		
		MensagemDoDia msg5 = new MensagemDoDia(new Sexta());
		msg5.mensagem();
		
		MensagemDoDia msg6 = new MensagemDoDia(new Sabado());
		msg6.mensagem();
	}
	
}
