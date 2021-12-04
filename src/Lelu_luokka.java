
public class Lelu_luokka 
{

	public static void main(String[] args) 
	{
		Lelu lelu1 = new Lelu("Palikka", 13);
		lelu1.tulostaTiedot();
		System.out.println("");
		
		Vieteriauto vieteriauto1 = new Vieteriauto("Puuauto", 40, 1);
		vieteriauto1.tulostaTiedot();
	}

} //Main-lopetus

class Lelu
{
	public String nimi;
	protected int paino;
	
	public Lelu(String nimi, int paino) //muodostin
	{
		this.nimi = nimi;
		this.paino = paino;
	}
	
	protected void tulostaTiedot() //tulostin
	{
		System.out.println("Lelun nimi on: " + nimi);
		System.out.println("Lelun paino on: " + paino);
	}
} //Lelu-luokan lopetus

class Vieteriauto extends Lelu
{
	public int nopeus;

	public Vieteriauto(String nimi, int paino, int nopeus)
	{
		super(nimi, paino);
		this.nopeus = nopeus;
	}
		
	public void kiihdyta()
	{
		nopeus++;
	}
	
	@Override
	public void tulostaTiedot()
	{
		System.out.println("Lelun nimi on: " + nimi);
		System.out.println("Lelun paino on: " + paino);
		System.out.println("Lelun nopeus on: " + nopeus);
	}
}
