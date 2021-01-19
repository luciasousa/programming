package pt.ua.prog2;

public class Contacto {
	
	private static int count;
	private String nome;
	private String telefone;
	private String email;
	
	public Contacto (String nome, String telefone) {
	
		this.nome = nome;
		this.telefone = telefone;
		
	}
	
	public Contacto (String nome, String telefone, String email) {

		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	
	public String nome() {
		
		return nome.toUpperCase();
	}
	
	public String telefone() {
		
		return telefone;
	}
	
	public String email() {
		
		return email;
	}
}
