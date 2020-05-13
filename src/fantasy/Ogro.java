package fantasy;
import java.util.Random;

/**
 * @author gordi
 * @author Raptuno
 * @version 1.0
 * @created 06-may.-2020 07:22:54 a. m.
 */
public class Ogro {
	
	Random r=new Random();
	public int Nombre; 
	public int Poder=r.nextInt(10)+1;
	public int Vida;
	public Mago villano;
	public Heroe Heroe;

	public Ogro(){

	}

	public void Ataque(){ //Atacar al h�roe
		Heroe.setVida(Heroe.getVida()-Poder);
	}

	public void Defensa(){ //Defender ataques del héroe
		
	}

	public void Morir(){
		System.out.println("¡Mataste al ogro, ahora ve por el mago!");
	}

	public void Obedecer(){ //Obedecer órdenes del mago
		
	}

	public void Proteger(){ //Proteger al mago
		villano.setVida(villano.getVida()-Heroe.Poder);
	}
}//end Ogro