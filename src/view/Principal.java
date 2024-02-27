package view;
import controller.DuploFController;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		DuploFController dfc = new DuploFController();
		
		int n = 0;
		
		while((n % 2) == 0) {
		
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira número ímpar"));
			
		}
		
		System.out.println("Fatorial duplo de " + n + " igual a: " + dfc.fnDupFat(n));
		
	}
	
}