package prjSisGasosa;

public class SisGasosa {

	public static void main(String[] args) {
		Combustivel c = new Combustivel();
		c.setNome("Gasolina");
		c.setPrecoVenda(3.25);
		c.setPrecoCusto(1.8);
		c.setQtde(0);
		
		System.out.println(c);
		System.out.println("Reajustando o preço em 15%....");
		c.reajustaPrecoVenda(15);
		System.out.println(c);		
	}

}
