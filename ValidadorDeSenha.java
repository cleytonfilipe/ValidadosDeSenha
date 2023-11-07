package validador;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidadorDeSenha {

    public static void main(String[] args) {
        
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        String maiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minuscula = "abcdefghijklmnopqrstuvwxyz";
        String numero = "0123456789";
        String especial = "!@#$%^&*";
        
        Scanner tl = new Scanner(System.in);
        System.out.println("Defina sua senha: \n"
                + "\n"
                + "Sua senha deve possuir de 6 à 16 caracteres e:\n"
                + "\n"
                + "Pelo menos uma letra maiúscula\n"
                + "Pelo menos uma letra minúscula\n"
                + "Pelo menos um número\n"
                + "Pelo menos um caractere especial (!@#$%^&*)\n"
                + "\n");
        String senhaUsuario = tl.next();
        tl.close();
        System.out.println();
        
        if (senhaUsuario.length() >= 6 && senhaUsuario.length() <= 16) {
            boolean possuiMaiuscula = verificaCaracteres(senhaUsuario, maiuscula);
            boolean possuiMinuscula = verificaCaracteres(senhaUsuario, minuscula);
            boolean possuiNumero = verificaCaracteres(senhaUsuario, numero);
            boolean possuiEspecial = verificaCaracteres(senhaUsuario, especial);
            
            if (possuiMaiuscula && possuiMinuscula && possuiNumero && possuiEspecial) {
                System.out.println("A senha " + senhaUsuario + " é válida!");
            } else {
                System.out.println("A senha " + senhaUsuario + " não atende aos critérios de validação.");
            }
        } else if (senhaUsuario.length() < 6) {
            System.out.println("Sua senha precisa de mais caracteres, digite pelo menos 6 caracteres");
        } else {
            System.out.println("Sua senha tem caracteres demais, elabore uma senha com até 16 caracteres :D");
        }
    }

    // Função para verificar se a senha contém pelo menos um conjunto de caracteres
    public static boolean verificaCaracteres(String senha, String conjuntoCaracteres) {
        Pattern pattern = Pattern.compile("[" + Pattern.quote(conjuntoCaracteres) + "]");
        Matcher matcher = pattern.matcher(senha);
        return matcher.find();
    }
}
