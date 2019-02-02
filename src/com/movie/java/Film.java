package com.movie.java;

public class Film 
{
	String name;
	String genre;
	int run_time;
	int year;
	
	
	public Film(String name, String genre, int run_time, int year) {
		super();
		this.name = name;
		this.genre = genre;
		this.run_time = run_time;
		this.year = year;
		
		//desni klik ispod polja kad ih napises i odaberes Source->Generate constructor using fields (podatci o filmu npr. String name,itd)
	}
	
	public void type()
	{
		System.out.println("Name: " + name +" Genre:" + " " + genre);
		
		// ovi prazni razmaci su tu da bude naravno razmak izmeedu "name","genre" i takvih stvari
	}

	public void Technical()
	{
		System.out.println(" Duration: " + run_time + " Year: " + year );
		
		//umjesto razmaka pod navodnicima stavi radije razmak prije npr. "Duration: " -> " Duration: "
	}
}
