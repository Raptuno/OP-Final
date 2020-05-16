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
	public int Poder=10; //Fuerza del jugador. Estás establecida en 10 considerando un tope de 100 HP.
	public int Vida=100;
	public int Ataque;
	
	public Hada Hada;
	public Mago villano=new Mago();
	public Ogro Ogro;
	public Villa Villa;
	
	//public Hashtable <String, String> swords=new Hashtable<String, String>();
	
	
	/*public void swordPick (Hashtable<String, String> swords)throws IOException {
		swords.put("Lanza de obsidiana", "6");
		swords.put("Katana", "10");
		swords.put("Cimitarra", "18");
		swords.put("Mandoble", "30");
		
		System.out.print(
				"\nTienes "
				+swords.size()+" espadas:"
				+"\n\tLanza de obsidiana ("+swords.get("Lanza de obsidiana")+" puntos de daño)"
				+"\n\tKatana ("+swords.get("Katana")+" puntos de daño)"
				+"\n\tCimitarra ("+swords.get("Cimitarra")+" puntos de daño)"
				+"\n\tMandoble ("+swords.get("Mandoble")+" puntos de daño)"
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
			setPoder(getPoder()+Integer.parseInt(swords.get("Mandoble")));
			break;
		}
	}
	*/
	
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
	//Termina Declaración Getters/Setters
	
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
}//end Heroe