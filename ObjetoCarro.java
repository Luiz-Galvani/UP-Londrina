import javax.swing.JOptionPane;

public class ObjetoCarro {
	public static void main(String [] args) {
		Carro c1 = new Carro();
		c1.tipo = "Porche";
		c1.placa = "AAA-0001";
		c1.cor = "Preto";
		c1.portas = 2;
		
		//OU
		//Usar o JOptionPane para scan das informações ou usar nextLine/nextInt
		
		Carro c2 = new Carro();
		c2.tipo= JOptionPane.showInputDialog("Digite o modelo do carro: ");
		c2.cor = JOptionPane.showInputDialog("Digtite a cor do carro: ");
		c2.placa = JOptionPane.showInputDialog("Digite a placa: ");
		
		//String n = JOptionPane.showInputDialog("Digite o número de portas: ");
		//c2.portas = Integer.parseInt(n);
		
		//OU
		
		c2.portas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas"));
		
		System.out.println("Dados do carro 1: \n"
						+"Tipo: "+ c1.tipo + "\n"
						+"Cor: "+ c1.cor +"\n"
						+"Placa: "+ c1.placa +"\n"
						+"Portas: "+ c1.portas +"\n"
						);
		
		System.out.println("Dados do carro 2: \n"
				+"Tipo: "+ c2.tipo + "\n"
				+"Cor: "+ c2.cor +"\n"
				+"Placa: "+ c2.placa +"\n"
				+"Portas: "+ c2.portas +"\n"
				);
		
		//OU
		JOptionPane.showMessageDialog(null,
				"Carro 2: \n"+
				"Tipo: " + c2.tipo + "\n"+
				"Cor: " + c2.cor + "\n"+
				"Placa: " + c2.placa + "\n"+
				"Portas: " + c2.portas + "\n");
		
		c1.ligar();
		c1.acelerar();
		c1.frear();
		c1.desligar();
		
	}
}
