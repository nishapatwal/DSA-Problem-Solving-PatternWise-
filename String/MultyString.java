package String;

public class MultyString {
     public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        long result = 0;
        long result1 = 0;
        
        for (int i = 0; i < num1.length(); i++) {
            char ch = num1.charAt(i);
            int st = ch - '0';
            result = (result * 10) + st;
        }
        
        for (int i = 0; i < num2.length(); i++) {
            char ch = num2.charAt(i);
            int st = ch - '0';
            result1 = (result1 * 10) + st;
        }
        
        long finalResult = result * result1;
        String str = "";

        while (finalResult > 0) {
            long lastDigit = finalResult % 10;
            char ch = (char) (lastDigit + '0');
            str = ch + str; 
            finalResult = finalResult / 10;
        }
        
        return str;
    }
    public static void main(String[] args) {
      String num1 = "2";
      String num2 = "3";
      System.err.println(multiply(num1,num2));
      
    }
}
