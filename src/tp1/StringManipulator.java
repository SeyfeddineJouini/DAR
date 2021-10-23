package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        //do your stuff
        System.out.println("reverse : ");
        String c="";
        for(int i=s.length()-1;i>=0;i--) {
        	 c+=s.charAt(i);
        }

        System.out.println(c);
    }

    public void isPalindrome(){
        //do your stuff
       boolean test=true;
    	for(int i=0;i<s.length()/2&& test==true;i++)
    		if(s.charAt(i)!=s.charAt(s.length()-1-i))
    			test=false;
    	if(test)
        System.out.println(s+" est palindrome");
    	else
    		System.out.println(s+" non palindrome");
    }

    public void toUpperCase(){
        //do your stuff
      String ch="";
        for(int i=0;i<s.length();i++) {
        	if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
        		int z;
                z = (int) s.charAt(i);
                z -= 32;
                ch += (char) z;
            }
        	else {
        		ch+=s.charAt(i);
        	}
        }
        System.out.println("uppercase : "+ch);
    }

    public void toLowerCase(){
        //do your stuff
        String ch="";
        for(int i=0;i<s.length();i++) {
        	if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
        		int z;
                z = (int) s.charAt(i);
                z += 32;
                ch += (char) z;
            }
        	else {
        		ch+=s.charAt(i);
        	}
        }
        System.out.println("lowercase : "+ch);
    }

    public void getVowelNumber(){
        //do your stuff
       s=s.toLowerCase();
    	int som=0;
    	for(int i=0;i<s.length();i++)
    		if(s.charAt(i) == 'a' || s.charAt(i)== 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
    			som++;
        System.out.println("vowelNumber : "+som);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
