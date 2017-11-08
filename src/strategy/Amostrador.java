package strategy;
public class Amostrador {
	private int[] populacao;
	public Amostrador(int[] codigosZip) {
		populacao = codigosZip;
	}
	public int[] selecionaSubconjunto(int tamanhoAmostra, Calculo calc) {
		return calc.calculaAmostra(tamanhoAmostra, getPopulacao());
	}	
	public int[] getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int[] populacao) {
		this.populacao = populacao;
	}
}