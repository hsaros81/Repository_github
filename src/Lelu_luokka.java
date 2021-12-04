
public class Lelu_luokka 
{

	public static void main(String[] args) 
	{
		Lelu lelu1 = new Lelu("Palikka", 13); //Luodaan olio lelu1
		lelu1.tulostaTiedot(); //Tulostetaan olion tiedot
		System.out.println("");
		
		Vieteriauto vieteriauto1 = new Vieteriauto("Puuauto", 40, 1); //Luodaan olio vieteriauto1
		vieteriauto1.tulostaTiedot(); //Tulostetaan uuden olion tiedot
	}

} //Main-lopetus

class Lelu //Luokka Lelu
{
	public String nimi; //muuttuja nimi
	protected int paino; //muuttuja paino
	
	public Lelu(String nimi, int paino) //muodostin
	{
		this.nimi = nimi;
		this.paino = paino;
	}
	
	protected void tulostaTiedot() //Metodi tietojen tulostukseen
	{
		System.out.println("Lelun nimi on: " + nimi);
		System.out.println("Lelun paino on: " + paino);
	}
} //Lelu-luokan lopetus

class Vieteriauto extends Lelu //Luokka Vieteriauto, joka perii Lelu-luokan tiedot
{
	public int nopeus; //Uusi muuttuja nopeus

	public Vieteriauto(String nimi, int paino, int nopeus) //Muodostin vieteriautolle
	{
		super(nimi, paino);
		this.nopeus = nopeus;
	}
		
	public void kiihdyta() //Metodi kiihdyta
	{
		nopeus++;
	}
	
	@Override
	public void tulostaTiedot() //Metodi, joka tulostaa tiedot
	{
		System.out.println("Lelun nimi on: " + nimi);
		System.out.println("Lelun paino on: " + paino);
		System.out.println("Lelun nopeus on: " + nopeus);
	}
}
