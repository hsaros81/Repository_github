
public class Lelu_luokka 
{

	public static void main(String[] args) 
	{

	}

} //Main-lopetus

class Lelu
{
	public String nimi;
	public int paino;
	
	public Lelu(String nimi, int paino) //muodostin
	{
		this.nimi = nimi;
		this.paino = paino;
	}
	
	public void tulosta() //tulostin
	{
		System.out.println("Lelun nimi on: " + nimi);
		System.out.println("Lelun paino on: " + paino);
	}
}
