public class DetFinAut{


	private String[] states;
	private String[] alphabet;
	private String[][] transFunc;
	private String start;
	private String[] accept;



	public DetFinAut(String[] states, String[] alphabet, String[][] transFuc, String start, String[]accept){

		this.states = states;
		this.alphabet = alphabet;
		this.transFunc = transFunc;
		this.start = start;
		this.accept = accept;
		

		/*if( !checkValidInput() ){
		
			throw new IllegalArgumentException("improper input");

		}*/


	}


	/*
	private boolean checkValidInput(){


		return true;

	}*/


	public boolean runOnInput(String input){

		String currentState = start;
		int inputIndex = 0;

		int currentStateRow = -1;
		int currentInputColmn = -1;

		int startStateIndex = 0;

		while(transFunc[0][startStateIndex] != start){
			startStateIndex++;
		}

		while(inputIndex < input.length()){
			
			//find the row for the current state

			
			//find the colmn for the current input
			
			//find the next state 

		}

		for(int i = 0; i < accept.length; i++){
			if(accept[i].equals(currentState)){
				return true;
			}
		}

		return false;

	}

	public boolean checkValidInput(){


		/*the transition function should be of the form:	
					0	1
				q1	q3	q3
				q2	q1	q2
				q3	q1	q1
			where the first row contains every character in the alphabet
			the left most colmn contains every state
			nothing is left blank between the states and the alphabet
		*/

		try{

		} catch (Exception e){
			return false;
		}

		return true;

	}


}
