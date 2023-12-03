package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String t="";
			for(int i = s.length()-1; i >= 0; i--) {
				t+=s.charAt(i);
				
			}
			System.out.println(t);
			
		}, "te");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String t="";
			for(int i = 0; i <s.length(); i++) {
				if (i%2==0) {
					Character up = s.charAt(i);
					String uper =up.toString().toUpperCase();
					
					t= t+uper;
				}
				else {

					t+=s.charAt(i);
				
			}
			
			
		}System.out.println(t);
			}, "testing");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String t="";
			for(int i = 0; i <s.length(); i++) {
				t+=s.charAt(i)+".";
			
			
		}System.out.println(t);
			}, "testing");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			
			String t="";
			for(int i = 0; i <s.length(); i++) {
				Boolean vow = false;
				 switch (s.charAt(i)) {
			        case 'a':  
			        	 vow=true;
			        case 'e':
			        	 vow=true;
			        case 'i':
			        	 vow=true;
			        case 'o':
			        	 vow=true;
			        case 'u':
			        	 vow=true;
			        case 'A':
			        	 vow=true;
			        case 'E': 
			        	 vow=true;
			        case 'I': 
			        	 vow=true;
			        case 'O':  
			        	 vow=true;
			        case 'U':
			            vow=true;
			            
			        
			    }
				
				 t= (vow)?(t):(t+=s.charAt(i));

			
		}System.out.println(t);
			}, "testing");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
