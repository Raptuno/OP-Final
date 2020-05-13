package fantasy;
import java.io.*;
import java.util.*;
import java.util.Random;

/**
 * @author Alejandro Nieto (Co-programador Java)
 * @author Alfonso Sánchez (Co-programador Java)
 * @version 1.0
 * @created 06-may.-2020 07:22:52 a. m.
 */
public class Heroe {
	
	Random r=new Random();
	
	public int lifeLimiter=100;
	
	public String Arma; //Arma a usar.
	public String Nombre=""; //Nombre. Está a elección del usuario
	int Poder=r.nextInt(11); //Poder de ataque. Se encuentra en una escala del uno al diez considerando una vida inicial de 100 HP
	public int Vida=100;
	public int Ataque=0;
	
	public Hada Hada;
	public Mago villano;
	public Ogro Ogro;
	public Villa Villa;
	
	public Hashtable <String, String> swords=new Hashtable<String, String>();
	
	
	public String swordPick (Hashtable<String, String> swords)throws IOException {
		swords.put("Lanza de obsidiana", "6");
		swords.put("Katana", "10");
		swords.put("Cimitarra", "18");
		swords.put("Mandoble", "30");
		
		System.out.print(
				"\nTienes "
				+swords.size()+" espadas:"
				+"\n\tLanza de obsidiana ("+swords.get("Lanza de Obsidiana")+" puntos de daño)"
				+"\n\tKatana ("+swords.get("Katana")+" puntos de daño)"
				+"\n\tCimitarra ("+swords.get("Cimitarra")+" puntos de daño)"
				+"\n\tMandoble ("+swords.get("Mabdoble")+" puntos de daño)"
				+"\n¿Cuál quieres, lanza, katana, cimitarra o mandoble? ");
		
		BufferedReader pick=new BufferedReader(new InputStreamReader(System.in));
		String picker=pick.readLine().toLowerCase();
		switch (picker) {
		case "lanza":
			Arma="Lanza de obsidiana";
			setPoder(Integer.parseInt(swords.get("Lanza")));
			break;
		case "katana":
			Arma="Katana";
			Ataque=Integer.parseInt(swords.get("Katana"));
			break;
		case "cimitarra":
			Arma="Cimitarra";
			Ataque=Integer.parseInt(swords.get("Cimitarra"));
			break;
		case "mandoble":
			Arma="Mandoble";
			Ataque=Integer.parseInt(swords.get("Mandoble"));
			break;
		}
		return Arma;
	}
	
	//Inicia Declaración Getters/Setters
	public int getPoder() {
		return this.Poder;
	}
	
	
	public void setPoder(int Poder) {
		this.Poder=Poder;
	}
	
	public int getVida() {
		return this.Vida;
	}
	
	public void setVida(int Vida) {
		this.Vida=Vida;
	}
	
	public int getAtaque() {
		return this.Ataque;
	}
	
	public void setAtaque(int Ataque) {
		this.Ataque=Ataque;
	}
	//Termina Declaraci�n Getters/Setters
	
	public Heroe(){
		
	}

	public void Atacar(){
		villano.setVida(villano.getVida()-Poder);
	}

	public void Construir(){ //Construir casas en la aldea
		Villa.setCasas(Villa.getCasas()+1);
	}

	public void Defender(){ //Defenderse de los ataques del ogro
		villano.setVida(villano.getVida()+1);
	}

	public void Salvar(){ //Robarle hadas al villano (Mago)
		villano.setBolso(villano.getBolso()-1);
	}
}//end Heroe