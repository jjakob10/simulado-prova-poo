package simulado_q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import simulado_q1.twitter.Tweet;
import simulado_q1.twitter.User;
import simulado_q1.twitter.UserBase;
import simulado_q1.twitter.VerifiedUser;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do
 * Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem de
 * usuários "verificados" (VerifiedUser)
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o
 * tamanho médio do atributo text de
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes.
 * 
 * 
 */

public class TestadorQ1 {
	public static void main(String[] args) {
		System.out.println("OLA mundo");

		UserBase ub = new UserBase();
		ub.addUser(new User("Matheus", "1234"));
		ub.addUser(new User("Johann", "3455"));
		ub.addUser(new User("Meio Metro", "2710"));
		ub.addUser(new VerifiedUser("Metro e meio", "27102003"));
		LocalDate data = LocalDate.parse("10/10/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		ub.addUser(new VerifiedUser("Yo", "122222", data));
		for (User u : ub.getUsers()) {
			u.addTweet(new Tweet(u.getNome() + " deu um oi!"));
		}

		for (User u : ub.getUsers()) {
			System.out.println("Tweets de " + u.getNome() + ":");
			for (Tweet t : u.getTweets()) {
				System.out.println("\t" + t.getText());
			}
		}
	}

}
