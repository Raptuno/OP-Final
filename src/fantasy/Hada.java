package fantasy;
import java.util.Random;

/**
 * @author Alejandro Nieto (Gen. de plantillas Java)
 * @author Alfonso Sánchez (Prog. en Java)
 * @version 1.0
 * @created 06-may.-2020 07:19:20 a. m.
 */
public class Hada {
	
	Random r=new Random();
	public String[] fairyNames= {
			"Celestia",
			"Asteria",
			"Isis",
			"Faye",
			"Ariel",
			"Aerwyna",
			"Tania",
			"Tatiana",
			"Xylia"}; //Algunos nombres fueron tomados de Terraria
	public String Nombre;
	public Villa Villa;
	public Heroe Heroe;
	Mago villano=new Mago();
	
	
	public Hada(){
		
	}
	
	public void namer(String[] fairyNames) {
		Nombre=fairyNames[r.nextInt(fairyNames.length)+1];
	}
	
	public void captura(){ //Ser capturada
		villano.setBolso(villano.getBolso()+1);
	}

	public void salve(){ //Ser salvada
		Heroe.Salvar();
		namer(fairyNames);
		System.out.println(Nombre+": ¡Gracias, forastero!");
	}

	public void Volar(){
		
	}
}//end Hada