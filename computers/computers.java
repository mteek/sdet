package computers;
import java.util.ArrayList;
import java.io.*;


public class computers {
		
		private String name;
		
		private int year; 
		
		private String brand; 
		
		private int storage;
		
		
		private computers (String name , int year) {
			name = "Surface Pro";
			year = 2015;
		}

		private  computers (String name, int year, int storage) {
			name = "MacBook Air";
			year = 2016;
			storage = 84;
		}
		
		///no private methods only private member variables 
		///so operations can be accessed outside the class
		
		
		///getters
		public String getName () {
			return name;
		}
		
		public int getYear () {
			return year;
		}
		
		public String getBrand () {
			return brand;
		}
		
		
	   ///setters
		
		public void setName (String name)
		{
			this.setName(name);
		}
		
		public void setYear (int Year)
		{
			this.setYear(year);
		}
		
		public void setBrand (String brand)
		{
			this.setBrand(brand);
		}
		
		///boolean
		
		public void setstorage (int storage)
		{
			if( storage >= 64 && storage <= 100) {
				this.storage = storage;
		} else{
			this.storage = 60; 
		}
		
		
		///string return 
		
		
			
			
			
		
		}
	}

