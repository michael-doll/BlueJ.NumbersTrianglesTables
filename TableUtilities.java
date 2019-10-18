 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder tableNums = new StringBuilder();
        int size = 5; 
        for(int i = 1; i <= size; i++){
            for(int j = 1; j<=size; j++){
                tableNums.append("  " +j*i + " |"); 
            }
            tableNums.append("\n"); 
            }
    String table = tableNums.toString();
    return table;
}

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
