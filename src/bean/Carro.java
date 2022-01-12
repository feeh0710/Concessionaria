package bean;

public class Carro extends Veiculo {
	// construtor
	public Carro(int qtdRodas, String modelo, int anoFabricacao, String cor, int velocidade, int chassi) {
		super(qtdRodas, modelo, anoFabricacao, cor, velocidade, chassi);
	}
	
	//abrirPorta, fecharPorta
	public String abrirPorta() {
		return "ABRIU PORTA";
	}
	public String fecharPorta() {
		return "FECHAR PORTA";
	}
	
	public void freiar(int zerar) {
		super.setVelocidade(zerar);
		
	}
	
	
	
}
