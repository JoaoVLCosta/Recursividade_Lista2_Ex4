package controller;

public class DuploFController {

	public DuploFController() {
		
		super();
	
	}
	
	public int fnDupFat(int n) {
		
		if(n == 1) {
			
			return 1;
			
		} else {
			
			return n * fnDupFat(n - 2);
			
		}
		
	}
	
}