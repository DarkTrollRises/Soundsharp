package rijnijssel.soundsharp.data;

public class MP3Player
{
	public int id;
	public String make;
	public String model;
	public int size;
	public double price;
	public int stock;
	public double priceToSize;
	
	public MP3Player(int id, String make, String model, int size, double price, int stock)
	{
		this.id = id;
		this.make = make;
		this.model = model;
		this.size = size;
		this.price = price;
		this.stock = stock;
		this.priceToSize = price / size;
	}
	
	public static MP3Player addPlayer(int id, String make, String model, int size, double price, int stock)
	{
		return new MP3Player(id, make, model, size, price, stock);
	}
}
