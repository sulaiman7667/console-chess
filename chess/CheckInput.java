package chess;

public class CheckInput {
	
	//This method requires your input
	public static boolean checkCoordinateValidity(String s){
        boolean numeric = true;
       
        if(s.isEmpty() == false){
            try {
                Double num = Double.parseDouble(s.substring(0,1));
            } catch (NumberFormatException e) {
                numeric = false;
            }

            if(numeric == true && s.length() > 1 && s.length() < 3 ){
            	if(Integer.parseInt(s.substring(0,1)) >= 1 && Integer.parseInt(s.substring(0,1)) <= 8 &&  (s.charAt(1) == 'a' || s.charAt(1) == 'b' || s.charAt(1) == 'c' || s.charAt(1) == 'd' || s.charAt(1) == 'e' || s.charAt(1) == 'f' || s.charAt(1) == 'g' || s.charAt(1) == 'h')){
    			return true;
    		}
            }
        }


		return false;
	}
}
