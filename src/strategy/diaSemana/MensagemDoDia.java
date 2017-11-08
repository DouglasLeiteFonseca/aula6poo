package strategy.diaSemana;

public class MensagemDoDia {
	private Dia dia;
	MensagemDoDia(Dia dia){
		this.dia = dia;
	}
	public void mensagem(){
		System.out.println(dia.mensagemDoDia());
	}
}
