package Aula_Exempo;
import javax.swing.*;
public class Exemplo_1 {
	public static void main(String[] args) {
		double peso,altura,imc;
		String nome, sexo, ret;
		int n1;
		nome = JOptionPane.showInputDialog(null,"Qual seu nome? ");
		sexo = JOptionPane.showInputDialog(null,"digite 1 para masculino:\ndigite 2 para feminino: ");
		int = Integer.parseInt(sexo);
		ret = JOptionPane.showInputDialog(null,"Qual sua altura? ");
		altura = Double.parseDouble(ret);
		ret = JOptionPane.showInputDialog(null,"Qual seu peso? ");
		peso = Double.parseDouble(ret);
		
		if(n1 == 1) {
			imc = peso / (altura*altura);
			
		}else if(n1== 2){
			imc = peso / (altura*altura);
		}if (n1==1) {
			if (imc >=17) {
				JOptionPane.showMessageDialog(null,"Você esta muito abaixo peso");
			}else if (imc >=18.49) {
				JOptionPane.showMessageDialog(null,"Você esta abaixo peso");
			}else if (imc >=24.99) {
				JOptionPane.showMessageDialog(null,"Você esta com peso normal");
		}else if (imc >=29.99) {
			JOptionPane.showMessageDialog(null,"Você esta acima do peso");
	}

		}if (n1==2) {
			if (imc >=19.1) {
				JOptionPane.showMessageDialog(null,"Você esta muito abaixo peso");
			}else if (imc >=25.8) {
				JOptionPane.showMessageDialog(null,"Você esta abaixo peso");
			}else if (imc >=27.3) {
				JOptionPane.showMessageDialog(null,"Você esta com peso normal");
			}else if (imc >=32.3) {
				JOptionPane.showMessageDialog(null,"Você esta acima do peso");
			}

}
	}
}

