// public class Concatupper {
//     String s1;
//     String s2;
//     Concatupper(String s1,String s2){
//         this.s1 = s1;
//         this.s2 = s2;
//     }
//      public static void main(String[] args) {
//        String s = "abhi";
//        String s_l = "03241";
//        String user = s.concat(s_l);
//        s = s.toUpperCase();
//        s = s.toUpperCase();

//        System.out.println(user);
//        System.out.println(s);

//     }
// }

import java.util.Locale;

class Geeks 
{
    public static void main(String args[]) 
    {
        // Custom input string
        String str = "Geeks for Geeks";

        // Locales with the language "tr" for TURKISH
        //"en" for ENGLISH is created
        Locale TURKISH = Locale.forLanguageTag("tr");
        Locale ENGLISH = Locale.forLanguageTag("en");

        // Converting string str to uppercase letter
        // using TURKISH and ENGLISH language
        String strup1 = str.toUpperCase(TURKISH);
        String strup2 = str.toUpperCase(ENGLISH);
      
        System.out.println(strup1);
        System.out.println(strup2);
    }
}