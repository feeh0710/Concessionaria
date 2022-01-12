package view;

import bean.Carro;
import bean.Moto;

public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro(5,"fiat",2002,"preta",10,4545456);
		System.out.println("qtd rodas carro: "+carro.getQtdRodas());
		System.out.println("cor carro: "+carro.getCor());
		System.out.println("velocidade atual: "+carro.exibirVelocidade());
		
		Moto moto = new Moto(4,"suzuki",2005,"azul",10,4545456);
		moto.setAnoFabricacao(2005);
		moto.setQtdRodas(2);
		moto.setVelocidade(50);
		moto.diminuirVelocidade(10);
		System.out.println("velocidade moto 1: "+moto.exibirVelocidade());
		System.out.println("modelo moto 1: "+moto.getModelo());
		
		
		Moto moto3 = new Moto(4,"honda",2005,"amarelo",80,25002532);
		System.out.println("modelo moto 3: "+moto3.getModelo());
		
		
	}
}
