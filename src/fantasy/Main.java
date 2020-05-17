package fantasy;

/**
 * @author Alfonso Sánchez
 */

import java.io.*;
import java.util.*;

public class Main { //Por qué Eclipse marca esta parte como instrucción perdida?
	
	public int lifeLimiter=100;
	public String loopC="S";
	
	static Ogro Shrek=new Ogro();
	static Heroe player=new Heroe();
	static Mago villano=new Mago();
	static Hada tbell=new Hada();
	static Villa dland=new Villa();
	public static String Nombre=""; //Nombre. Está a elección del usuario

	
	void attack() throws IOException{
		
		System.out.println("¿A quién queres atacar? ");
		BufferedReader attPick=new BufferedReader(new InputStreamReader(System.in));
		String attNit=attPick.readLine();
		
		if(attNit.equalsIgnoreCase(villano.Nombre)) {
			System.out.println(
					"Atacaste a "+villano.Nombre+" y perdió "+player.getPoder()+" puntos de salud"
					+" pero su ogro te ataca y pierdes 10 punto de salud"
					);
			villano.setVida(villano.getVida()-player.getPoder());
			player.setVida(player.getVida()-Shrek.getPoder());
		} else if(attNit.equalsIgnoreCase("Ogro")) {
			System.out.println("El ogro y tú se atacan entre sí, haciendo que ambos pierdan "
					+player.getPoder()+" y "+Shrek.getPoder()+"."
					+"\nAh, y "+villano.Nombre+" secuestró una hada durante el caos que hicieron"
					);
			Shrek.setVida(Shrek.getVida()-player.getPoder());
			player.setVida(player.getVida()-Shrek.getPoder());
			dland.setHadas(dland.getHadas()-1);
			villano.setBolso(villano.getBolso()+1);;
		}
	}
	
	void defend() {
		System.out.print(
				"\nDefiendes el ataque del ogro, pero "+villano.Nombre);
		
		if(villano.getVida()+3<100) {
			villano.setVida(villano.getVida()+3);
			System.out.print(" tiene oportunidad de curarse y recupera 3 puntos de salud\n");
		} else if (villano.getVida()+3<100&&dland.getHadas()>1){
			dland.setHadas(dland.getHadas()-1);
			villano.setBolso(villano.getBolso()+1);;
			System.out.print(" aprovechó que estaba completamente curado y secuestró un hada\n");
		} else {
			System.out.print(" vió que no tenías hadas y que estaba curado, así que te atacó por la espalda y pierdes "+villano.getPoder()+" puntos de salud\n\n");
			player.setVida(player.getVida()-villano.getPoder());
		}
	}
	
	void build() {
		dland.setCasas(dland.getCasas()+1);
	}
	
	public void save() {
		tbell.salve();
		dland.setHadas(dland.getHadas()+1);
		if (dland.Hadas%10==0) {
			build();
			System.out.println("Tienes un número de hadas que es múltiplo de 10, por lo que una casa nueva se construyó automáticamente");
		}
		
	}

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		BufferedReader baptism=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("¡Necesitamos tu ayuda!"
				+"\nal malvado "+villano.Nombre+" le gusta secuestrar hadas para usar su polvo y ser más poderoso."
				+"\nDebes ayudar a las hadas a escapar y esconderse en la aldea. Pero ten cuidado, "
				+villano.Nombre+" intentará hacer de todo para que no lo derrotes,"
				+"¡hasta llamará a su ogro para que te ataque!"
				);
		System.out.print("\n\nPero antes de que partamos, ¿cómo te llamas? ");
		Nombre=baptism.readLine();
		System.out.println("\nBienvenid@, "+Nombre+"\n");
		
		System.out.println("\n\nDebes salvar "+villano.getBolso()+" hadas");
		while (villano.getBolso()>0) {
			BufferedReader play=new BufferedReader(new InputStreamReader(System.in));
			System.out.println(
					"Tienes 4 opciones: "
							+"\n\t1. Atacar al mago/ogro (atacar)"
							+"\n\t2. Defenderte de ataques del ogro (defender)"
							+"\n\t3. Construir una casa (construir)"
							+"\n\t4. Salvar un hada (salvar)"
					);
			System.out.println("Hadas por salvar+ "+villano.getBolso());
			String action=play.readLine().toLowerCase();
			System.out.println("Acción: "+action);
			
			
			switch (action) {
			//Atacar
			case "atacar":
				attack();
				break;
			case "1":
				attack();
				break;
			//Fin atacar
				
			//Defender
			case "defender":
				defend();
				break;
			case "2":
				defend();
				break;
			//Fin Defender
				
			//Construir
			case "construir":
				build();
				break;
			case "3":
				build();
				break;
			//Fin construir
			
			//Salvar
			case "salvar":
				save();
				break;
			case "4":
				save();
				break;
			//Fin salvar
			default:
				System.out.println("¿Qué clase de magia es ésta?");
				break;
			}
			System.out.println(
					"Estadísticas del juego:"
					+"\n\tPuntos de salud del jugador: "+player.getVida()
					+"\n\tPuntos de salud del mago: "+villano.getVida()
					+"\n\tHadas salvadas: "+dland.getHadas()
					+"\n\tHadas por rescatar: "+villano.getBolso()
					);
		}
	}
}
