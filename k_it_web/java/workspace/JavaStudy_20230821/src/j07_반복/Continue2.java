package j07_반복;

public class Continue2 {
	
	public static void main(String[] args) {
		
	    String names = "최창규님, 정지윤님,전수빈님/오재근님";
	    String totalNames = null;
	    
	    for(int i = 0; i < names.length(); i++) {
	    	
	    	String subNames = names.substring(i, i + 1);
	    	
	    	if(subNames.equals("님")
	    		|| subNames.equals(",")
	    		|| subNames.equals(" ")
	    		|| subNames.equals("/")) {
	    		continue;
	    	}
	    	totalNames += subNames;
	    }
	    System.out.println(totalNames.substring(4));
	}
}