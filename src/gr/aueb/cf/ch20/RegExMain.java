package gr.aueb.cf.ch20;

public class RegExMain {
    public static void main(String[] args) {
        String s = "infoaueb.gr";
        String s2 = "13/12/24";
        String s3 = "Athens Uni     of Eco          and  Bus";

//        System.out.println(isRed(s));
//        System.out.println(isRedOrGreen(s));
//        System.out.println(beginsWithOneUpperCaseAndEndsIning(s2));
        System.out.println(isEmail(s));
        System.out.println(isDate(s2));
        String[] tokens = doSplit(s3);
        for (String token : tokens) {
            System.out.println(token + " ");
        }

        System.out.println(doReplace(s3));
    }

    /**
     * Checks (matches) if input string
     * is "red"
     * @param s
     * @return
     */

    public static boolean isRed(String s) {
        return s.matches("red");
    }

//   /**Checks (matches) if input string
//     * is "red" or "green"
//     * @param s
//     * @return
//     */
//    public static boolean isRedOrGreen(String s) {
//        return s.matches("red|green");
//    }

    /**
     * Checks (matches) if input string
     * is "red" or "Red" or "green" or "Green"
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String s) {
       // return s.matches(".\\d");
        return s.matches(".[0-9]");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

     public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{2,4}");
     }

     public static String[] doSplit(String s) {
        return s.split("\\s+");
     }

     public static String doReplace(String s) {
        return  s.replaceAll("\\s+", "&");
     }

     public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
     }


}
