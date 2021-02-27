
import java.util.*;

public class SymbolsTable {
    public static Hashtable<String, Integer> symbols = new Hashtable<String, Integer>();
    public static void put(String key, Integer value){
        symbols.put(key, value);
    }
    public static int get(String key){
        return symbols.get(key);
    }
}