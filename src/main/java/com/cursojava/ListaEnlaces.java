package com.cursojava;

import java.util.HashMap;
import java.util.Map;

public class ListaEnlaces {

	public static final Map<String, String> COCHES = new HashMap<>(){
		private static final long serialVersionUID = 1L;
		{
            put("Audi", "https://www.audi.es/");
            put("BMW", "https://www.bmw.es/");
            put("Mercedes", "https://www.mercedes-benz.es/");
        }
		public String toString() {
			return "coches";
		}
    };
    
	public static final Map<String, String> JUEGOS = new HashMap<>(){
		private static final long serialVersionUID = 1L;
		{
            put("3DJuegos", "https://www.3djuegos.com/");
            put("Meristation", "https://as.com/meristation/");
            put("EuroGamer", "https://www.eurogamer.es/");
        }
		public String toString() {
			return "juegos";
		}
    };
    
	public static final Map<String, String> ROPA = new HashMap<>(){
		private static final long serialVersionUID = 1L;
		{
            put("Zara", "https://www.zara.com/es/");
            put("Bershka", "https://www.bershka.com/es/");
            put("Pull&Bear", "https://www.pullandbear.com/es/");
        }
		@Override
		public String toString() {
			return "ropa";
		}
    };
    
	
	
}
