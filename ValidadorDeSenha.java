package validador;

import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		
		boolean contemCaracter = true;
		
		Scanner tl = new Scanner(System.in);
		System.out.println("Defina sua senha: \n"
				+ "\n"
				+ "Sua senha deve possuir de 6 à 16 caracteres e:\n"
				+ "\n"
				+ "Uma letra maiúscula\n"
				+ "Uma letra minúscula\n"
				+ "Um número\n"
				+ "Um caractere especial (!@#$%^&*)\n"
				+ "\n");
		String senhaUsuario = tl.next();
		tl.close();
		System.out.println();
		
		if (senhaUsuario.length() >= 6 && senhaUsuario.length() <= 16 ) {
			
			for (int i = 0; i < caracteres.length(); i++) {
				char caracter = caracteres.charAt(i);
				
				if (!senhaUsuario.contains(String.valueOf(caracter))) {
				contemCaracter = false;
				break;
				}
				
			}
			
			if (contemCaracter) {
				System.out.println("A senha " + senhaUsuario + " é válida!");
			} else {
				System.out.println("A senha " + senhaUsuario + " não contém os caracteres necessários...");
			}
			
		} else  if (senhaUsuario.length() < 6){
			
			System.out.println("Sua senha precisa de mais caracteres, digite pelo menos 6 caracteres");
			
		} else {
			
			System.out.println("Sua senha tem caracteres demais, elabore uma senha com até 16 caracteres :D");
			
		}

	}

}
