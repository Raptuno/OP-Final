package fantasy;
import java.util.Random;

/**
 * @author Alejandro Nieto (Gen. de plantillas Java)
 * @author Alfonso Sánchez (Prog. en Java)
 * @version 1.0
 * @created 06-may.-2020 07:22:45 a. m.
 * Erick Benjamín Glez. hizo la programación en Python
 * Código grapa del randomizer con rango: 
 * {@code
 * import java.util.Random; //Después de declarar del paquete
 * Random randomVarName=new Random(); //Al principio de la clase
 * varName=randomMarName.nextInt(x) //+1 si es necesario; //Debe llamarse cuando sea necesario
 * }
 */
public class Mago {
	
	Random fetch=new Random();
	
	public Hada Hada;
	public Heroe Heroe;
	
	public int Bolso; //Bolso de hadas del mago
	public String Nombre="Drelas"; //Nombre del mago. Tomé el nombre prestado de un NPC en Skyrim
	public int Poder=fetch.nextInt(10)+1; //Fuerza de ataque del mago
	public int Vida=fetch.nextInt(100)+1; //Vida del mago

	public Mago(){
		
	}

	//Inicia Declaración Getters/Setters
	public int getBolso() {
		return this.Bolso;
	}
	
	public void setBolso(int Bolso) {
		this.Bolso=Bolso;
	}
	
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
	//Termina Declaraci�n Getters/Setters

	public void Atacar(){
		Heroe.setVida(Heroe.getVida()-Poder); 
	}

	public void powerLoss(){//Disminuir poder del mago por cada 10 hadas rescatadas
		setBolso(getBolso()-1);
		if(Bolso%10==0) {
			setPoder(getPoder()-1);
		}
	}

	public void powerAdd(){//Aumentar poder del mago por cada 10 hadas capturadas
		setBolso(getBolso()+1);
		if(Bolso%10==0) {
			setPoder(getPoder()+1);
		}
	}

	public void proxyOgre(){ //Ordenar ataques al ogro
		
	}
}//end Mago