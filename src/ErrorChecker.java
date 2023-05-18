public class ErrorChecker {
    public static boolean isDigit(String num) {
        boolean is = false;
         try {
             Long.parseLong(num);
         } catch (Exception e) {
             is = true;
         }
         return is;
    }
}
