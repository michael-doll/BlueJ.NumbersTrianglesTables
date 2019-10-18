 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      StringBuilder tableNums = new StringBuilder();
        
        int size = 5; 
        for(int i = 1; i <= size; i++){
            for(int j = 1; j<=size; j++){
                tableNums.append(String.format("%3d",j*i)).append(" |"); 
               
            }
            tableNums.append("\n"); 
            }
    String table = tableNums.toString();
    return table;

}

    public static String getLargeMultiplicationTable() {
        StringBuilder tableNums = new StringBuilder();
        int size = 10; 
        for(int i = 1; i <= size; i++){
            for(int j = 1; j<=size; j++){
                tableNums.append(String.format("%3d",j*i)).append(" |"); 
            }
            tableNums.append("\n"); 
            }
    String table = tableNums.toString();
    return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder tableNums = new StringBuilder();
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j<=tableSize; j++){
                tableNums.append(String.format("%3d",j*i)).append(" |"); 
            }
            tableNums.append("\n"); 
            }
    String table = tableNums.toString();
    return table;
    }
}
