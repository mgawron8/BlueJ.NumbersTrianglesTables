


public class NumberUtilities {

    public static String getRange(int stop) {
        int i;
        String validNumbers = "";
        for(i=0; i<stop;i++){
        
            validNumbers = validNumbers + Integer.toString(i);
        
        }
        
        return validNumbers;
    }

    public static String getRange(int start, int stop) {
        int i;
        String validNumbers = "";
        for(i=start; i<stop;i++){
            
            validNumbers = validNumbers + Integer.toString(i);
        
        }
        
        return validNumbers;
    }


    public static String getRange(int start, int stop, int step) {
          int i;
        String validNumbers = "";
        for(i=start; i<stop;i+=step){
            
            validNumbers = validNumbers + Integer.toString(i);
        
        }
        
        return validNumbers;
    }

    public static String getEvenNumbers(int start, int stop) {
        int i;
        String validNumbers = "";
        for(i=start; i<stop;i++){
            if (i % 2 == 0){
            validNumbers = validNumbers + Integer.toString(i);
        }
        }
        
        return validNumbers;
    }



    public static String getOddNumbers(int start, int stop) {
        int i;
        String validNumbers = "";
        for(i=start; i<stop;i+=2){
            if (!(i / 2 == 0)){
            validNumbers = validNumbers + Integer.toString(i);
        }
        }
        
        return validNumbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        int i;
        int j;
        int h = 0;
        String validNumbers = "";
        for(i=start; i<=stop; i++){
            h = (int)Math.pow(i,exponent);
            validNumbers = validNumbers + Integer.toString(h);
        }
    
        return validNumbers;
    }
}
