package fantasy;
import java.util.*;

/**
 * @author Alejandro Nieto (Gen. de plantillas Java)
 * @author Alfonso Sánchez (Prog. en Java)
 * @version 1.0
 * @created 06-may.-2020 07:19:20 a. m.
 */
public class Hada {
	
	Random r=new Random();
	/*public String[] fairyNames= {
			"Celestia",
			"Asteria",
			"Isis",
			"Faye",
			"Ariel",
			"Aerwyna",
			"Tania",
			"Tatiana",
			"Xylia"}; //Algunos nombres fueron tomados de Terraria (NPC Dríada)
			*/
	
	//public String Nombre;
	public Villa Villa;
	public Heroe Heroe=new Heroe();
	public Main handler=new Main();
	Mago villano=new Mago();
	
	
	public Hada(){
		
	}
	
	/*public String getName() {
		return this.Nombre;
	}
	
	public void setName(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void namer(String[] fairyNames) {
		for(int i=0; i<fairyNames.length; i++) {
			setName(fairyNames[i]);
		}
	}*/
	
	public void captura(){ //Ser capturada
		villano.setBolso(villano.getBolso()+1);
	}

	public void salve(){ //Ser salvada
		//namer(fairyNames);
		villano.setBolso(villano.getBolso()-1);
		System.out.println("Hada: ¡Gracias, "+handler.Nombre+"!");
	}

	public void Volar(){
		Villa.setHadas(Villa.getHadas()+1);
	}
}//end Hada