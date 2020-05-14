package fantasy;
import java.io.*;

public class Game{
	
	Ogro Shrek=new Ogro();
	Mago villano= new Mago();
	Heroe player=new Heroe();
	Hada tbell=new Hada();
	Villa dland=new Villa();
	Main handler=new Main();
	
	int lifeLimiter=100;
	
	public String looper="Sí";
	public int gameOverStatus;
	
	void attack() {
		
		System.out.println("¿A quién queres atacar? ");
		BufferedReader attPick=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println(
				"Atacaste a "+villano.Nombre+" y perdió "+player.getPoder()+" puntos de salud"
				+" pero su ogro te ataca y pierdes 10 punto de salud"
				);
		villano.setVida(villano.getVida()-player.getPoder());
		player.setVida(player.getVida()-Shrek.getPoder());
		System.out.println(
				"Estadísticas del juego:"
				+"\n\tPuntos de salud del jugador: "+player.getVida()
				+"\n\tPuntos de salud del mago: "+villano.getVida()
				);
	}
	
	void defend() {
		System.out.println(
				"Defiendes el ataque del ogro, ");
		
		if(villano.getVida()+3<100) {
			System.out.print("pero "+villano.Nombre+" tiene oportunidad de curarse y recupera 3 puntos de salud");
		}
		System.out.println(
				"Estadísticas del juego:"
				+"\n\tPuntos de salud del jugador: "+player.getVida()
				+"\n\tPuntos de salud del mago: "+villano.getVida()
				);
	}
	
	void build() {
		
	}
	
	void save() {
		tbell.salve();
		tbell.Volar();
	}
	
	int getGOS() {
		return this.gameOverStatus;
	}
	
	void setGOS(int gameOverStatus) {
		this.gameOverStatus=gameOverStatus;
	}
	
	public void gameOverHandling(String gameOverStatus) {
		int vidaM=villano.getVida();
		int vidaH=player.getVida();
		if (vidaM==0) {
			setGOS(1);
		} else if(vidaH==0) {
			setGOS(2);
		} else {
			setGOS(0);
		}
	}
	
	public void gameOn() throws IOException{
		
		BufferedReader play=new BufferedReader(new InputStreamReader(System.in));
		
		while (looper.equalsIgnoreCase("Sí")||looper.equalsIgnoreCase("Si")) {
			System.out.println(
					"Tienes 4 opciones: "
							+"\n\t1. Atacar al mago"
							+"\n\t2. Defenderte de ataques del ogro"
					);
			String action=play.readLine().toLowerCase();
			System.out.println("Acción: "+action);
			
			
			switch (action) {
			case "atacar":
				attack();
				break;
			case "defender":
				defend();
				break;
			case "construir":
				build();
				break;
			case "salvar":
				save();
				break;
			default:
				System.out.println("¿Qué clase de magia es ésta?");
				break;
			}
			System.out.println("¿Jugar de nuevo? ");
			looper=play.readLine();
			if (looper.equalsIgnoreCase("Sí")||looper.equalsIgnoreCase("Si")) {
				
			} else {
				break;
			}
		}
		switch(gameOverStatus) {
		case 1:
			System.out.println(
					"¡Gracias por tu ayuda!"
					+"\nEn verdad ayudaste"
					);
			break;
		case 2:
			System.out.println(
					"¡Oh no! Ganó"
					+villano.Nombre
					+", ¡estamos condenados!"
					);
		default:
			System.out.println(
					"Ok, pero tendrás que jugar desde el inicio posteriormente"
					);
		}
	}
}
