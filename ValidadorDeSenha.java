package validador;

import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {
		
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
		
		if (senhaUsuario.length() >= 6 && senhaUsuario.length() <= 16 ) {
			
			System.out.println("número de caracteres aceitavel");
			
		} else  if (senhaUsuario.length() < 6){
			
			System.out.println("Sua senha precisa de mais caracteres, digite pelo menos 6 caracteres");
			
		} else {
			
			System.out.println("Sua senha tem caracteres demais, elabore uma senha com até 16 caracteres :D");
			
		}

	}

}
