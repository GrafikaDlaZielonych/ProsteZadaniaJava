package JavaZadanka.odc9;

/**
 * Napisz metode która sprawdzi czy łańcuch znaków
 * jest palindromem
 */
 
public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome("tekst"));     //false
        System.out.println(isPalindrome("teet"));      //true
        System.out.println(isPalindrome("oko w oko")); //true
    }

    static boolean isPalindrome(String s){

        for(int i = 0; i < s.length() / 2; i++)
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;

        return true;
    }
}
