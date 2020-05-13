package fantasy;

/**
 * @author Alfonso Sánchez
 */

import java.io.*;
import java.util.*;

public class Main { //Por qué Eclipse marca esta parte como instrucción perdida?
	
	public String loopC="S";
	
	static Ogro Shrek=new Ogro();
	static Heroe player=new Heroe();
	static Mago villano=new Mago();
	static Hada tbell=new Hada();
	static Villa dland=new Villa();
	static Game match=new Game();
	
	static boolean fileFound=false;
	static Object inputter=new Object();
	static Hashtable<String, String>cha=new Hashtable<>();
	
	public static void chSave() { // Lo que hace esta función es guardar y cargar información del héroe al programa
		File saveSlot=new File(player.Nombre+".txt");
		
		if(saveSlot.exists()) {
			System.out.println("¡Bienvenid@ de vuelta, "
					+player.Nombre
					+"!\n\nComo pudiste ver, "
					+villano.Nombre
					+" simplemente no aprende que no debe estar secuestrando hadas. "
					+"\n¡Ya hasta se consigió otro ogro, ¿cómo ves?!"
					+"\nPor supuesto debes derrotarlo otra vez, pero personalmente no creo que aprenda..."
					+"\n\nTu fuerza de ataque: "+player.getPoder()
					);
			
			if (saveSlot.length()>0) {
				try {
					FileInputStream reader=new FileInputStream(saveSlot);
					ObjectInputStream sniffer=new ObjectInputStream(reader);
					cha=(Hashtable<String, String>) sniffer.readObject();
					sniffer.close();
					reader.close();
					System.out.println(cha);
				} catch (Exception e) {
					System.out.println(
							"Algo raro acaba de pasar."
							+"Busca a un mago llamado Raptuno y muestrale ésto:\n"); e.printStackTrace();
				}
			} else {
				try {
					System.out.println("¡Espera, necesitas un arma!");
					FileOutputStream writer=new FileOutputStream(saveSlot);
					ObjectOutputStream getch=new ObjectOutputStream(writer);
					
					player.swordPick(player.swords);
					
					cha.put("Nombre", player.Nombre);
					cha.put("Arma", player.Arma);
					cha.put("Poder", player.swords.get(Integer.parseInt(player.Arma)));
					
					getch.writeObject(cha);
					getch.close();
					writer.close();
					System.out.println("Datos cargados con éxito");
				} catch (Exception e) {
					System.out.println(
							"Algo raro acaba de pasar."
							+"Busca a un mago llamado Raptuno y muestrale ésto:\n"); e.printStackTrace();
				}
			}
		} else {
			try {
				System.out.println("Ok");
				
				player.swordPick(player.swords);
				
				saveSlot.createNewFile();
				System.out.println("Archivo creado con éxito");
				cha.put("Nombre", player.Nombre);
				cha.put("Arma", player.Arma);
				
				FileOutputStream writer=new FileOutputStream(saveSlot);
				ObjectOutputStream getch=new ObjectOutputStream(writer);
				
				getch.writeObject(cha);
				getch.close();
				writer.close();
				System.out.println("Datos cargados con éxito");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		BufferedReader baptism=new BufferedReader(new InputStreamReader(System.in));
		
		villano.setBolso(tbell.fairyNames.length); //Decidí inicializar el valor del bolso en el método main porque intentar hacerlo en la clase Mago llamando a .length en fairyNames (Clase Hada) arrojaba NullPointerException
		
		System.out.print("¡Necesitamos tu ayuda!"
				+"\nEl malvado "+villano.Nombre+" ha capturado a "
				+villano.Bolso+" hadas para usar su polvo y ser más poderoso."
				+"\nDebes ayudar a las hadas a escapar y esconderse en la aldea. Pero ten cuidado, "
				+villano.Nombre+" intentará hacer de todo para que no lo derrotes,"
				+"¡hasta llamará a su ogro para que te ataque!"
				);
		System.out.print("\n\nPero antes de que partamos, ¿cómo te llamas? ");
		player.Nombre=baptism.readLine();
		System.out.println();
		chSave();
		
		while(match.looper.equalsIgnoreCase("Sí")||match.looper.equalsIgnoreCase("Si")) {
			match.gameOn();
		}
	}
}
