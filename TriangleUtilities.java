 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder stars = new StringBuilder(); 

        for(int i =0; i <numberOfStars; i++){
            stars.append("*"); 
        }
        
        String stringOfStars = stars.toString();
        return stringOfStars;
    }
    

    public static String getTriangle(int numberOfRows) {
        StringBuilder stars = new StringBuilder();
        
        for(int i =1; i <= numberOfRows; i++){
        stars.append(getRow(i));
        stars.append("\n");
    }
    String triangle = stars.toString();
        return triangle; 
    }
    public static String getSmallTriangle() {
        StringBuilder stars = new StringBuilder();
        
        for(int i =1; i < 5; i++){
        stars.append(getRow(i));
        stars.append("\n");
    }
    String triangle = stars.toString();
        return triangle;
    }

    public static String getLargeTriangle() {
        StringBuilder stars = new StringBuilder();
        
        for(int i =1; i < 10; i++){
        stars.append(getRow(i));
        stars.append("\n");
    }
    String triangle = stars.toString();
        return triangle;
    }    
}
