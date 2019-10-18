


public class NumberUtilities {

    public static String getRange(int stop) {
        String range = "";
        for(int i =0; i < stop; i++){
        String current = Integer.toString(i);
        range += current; 
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int i =start; i < stop; i++){
            String current = Integer.toString(i); 
            range += current; 
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for(int i =start; i < stop; i+=step){
            String current = Integer.toString(i); 
            range += current;
            
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
         String evenString = "";
        for(int i = start; i < stop; i++){
            if(i%2 ==0){
           String current = Integer.toString(i);
           evenString += current; 
        }
        }
        return evenString;
    
    }


    public static String getOddNumbers(int start, int stop) {
                 String oddString = "";
        for(int i = start; i < stop; i++){
            if(i%2 !=0){
           String current = Integer.toString(i);
           oddString += current; 
        }
        }
        return oddString;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        return null;
    }
}
