import java.util.*;

public class Program6 { 
    public static void main(String[] args) { 
        Main t= new Main(); 
        System.out.println("Enter input number: ");
        Scanner s= new Scanner(System.in);
        int input= s.nextInt();
        int polyNum=t.polydrum(input); 
    } 
    public int polydrum(int input){ 
        int nPoly=0; 
        do { 
            String string = ""; 
            String iString=""+input; 
            int iLength=iString.length(); 
            for(int i=iLength-1;i>=0;i--){ 
                string += iString.charAt(i); 
                if(iString.equals(string)){ 
                    System.out.println("Nearest Palindrome number is "+iString); 
                    nPoly=Integer.parseInt(string); 
                    return nPoly;
                } 
            } 
            input=input+1; 
        } 
        while(nPoly!=input); 
        return nPoly; 
    } 
}
