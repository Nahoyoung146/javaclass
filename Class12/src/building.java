
public class building {
	String tradename;
	int floor;
		
	building(){
		this.tradename = "멋쟁이";
		this.floor = 9;
	}
	
	building(String tradename){
		this.tradename=tradename;
		this.floor=5;
	}
	
	building(String tradename,int floor){
		this.tradename=tradename;
		this.floor=floor;
	}
}