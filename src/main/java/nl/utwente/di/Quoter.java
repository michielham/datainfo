package nl.utwente.di;

public class Quoter {
	
	public double getBookPrice(String i){
		if(i.equals("1")){
			return 10.0;
		}
		else if(i.equals("2")){
			return 45.0;
		}
		else if(i.equals("3")){
			return 20.0;
		}
		else if(i.equals("4")){
			return 35.0;
		}
		else if(i.equals("5")){
			return 50.0;
		}
		return 0;
	}

}
