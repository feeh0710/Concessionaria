package bean;

public  class Veiculo {
	// atributos do carro
			private int qtdRodas;
			private String modelo;
			private int anoFabricacao;
			private String cor;
			private int velocidade;
			private int chassi;
			
			public Veiculo(int qtdRodas, String modelo, int anoFabricacao, String cor, int velocidade, int chassi) {
				this.qtdRodas = qtdRodas;
				this.modelo = modelo;
				this.anoFabricacao = anoFabricacao;
				this.cor = cor;
				this.velocidade = velocidade;
				this.chassi = chassi;
			}

			
			//exibirVelocidade
			public int exibirVelocidade() {
				return this.velocidade;
			}
			
			// aumentarVelocidade,diminuirVelocidade
			public void aumentarVelocidade(int acrescimoVelocidade) {
				this.velocidade += acrescimoVelocidade;
			}
			public void diminuirVelocidade(int reduzirVelocidade) {
				this.velocidade -= reduzirVelocidade;
			}

			public int getQtdRodas() {
				return qtdRodas;
			}

			public void setQtdRodas(int qtdRodas) {
				this.qtdRodas = qtdRodas;
			}

			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public int getAnoFabricacao() {
				return anoFabricacao;
			}

			public void setAnoFabricacao(int anoFabricacao) {
				this.anoFabricacao = anoFabricacao;
			}

			public String getCor() {
				return cor;
			}

			public void setCor(String cor) {
				this.cor = cor;
			}

			public int getVelocidade() {
				return velocidade;
			}

			public void setVelocidade(int velocidade) {
				this.velocidade = velocidade;
			}
			
			
}
