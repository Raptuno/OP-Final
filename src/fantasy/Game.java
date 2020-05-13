package fantasy;
import java.io.*;

public class Game{
	
	Ogro Shrek=new Ogro();
	Mago villano= new Mago();
	Heroe player=new Heroe();
	Hada tbell=new Hada();
	Villa dland=new Villa();
	Main handler=new Main();
	
	void attack() {
		System.out.println("Atacaste a "+villano.Nombre+" pero su ogro te ataca y ambos pierden 1 punto de salud");
		villano.setVida(villano.getVida()-1);
		player.setVida(player.getVida()-1);
	}
	
	void defend() {
		System.out.println();
	}
	
	void build() {
		
	}
	
	void save() {
		tbell.salve();
		
	}
	
	public void gameOn() throws IOException{
		BufferedReader play=new BufferedReader(new InputStreamReader(System.in));
		String action=play.readLine();
	}
}
