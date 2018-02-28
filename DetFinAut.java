public class DetFinAut{


	private String[] states;
	private String alphabet;
	private String[] transFunc;
	private String start;
	private String[] accept;



	public DetFinAut(String[] states, String alphabet, String[] transFuc, String start, String[]accept){

		this.states = states;
		this.alphabet = alphabet;
		this.transFunc = transFunc;
		this.start = start;
		this.accept = accept;
		

		if( !checkValidInput() ){
		
			throw new IllegalArgumentException("improper input");

		}


	}


	private boolean checkValidInput(){


		return true;

	}


	public boolean runOnInput(String input){

		return true;

	}


}
