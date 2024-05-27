package main.java.neoflex.proxy;
import java.util.HashMap;
import java.util.Map;

public class DatabaseProxy implements IDatabase{

    private final DatabaseImpl database;
    private final Map<String, String> cache;

    public DatabaseProxy(DatabaseImpl database){
        this.database = database;
        cache = new HashMap<>();
    }

    @Override
    public String connect(String dbName, String URL){
        if (!cache.containsKey(dbName)) {
            String db = database.connect(dbName, URL);
            cache.put(dbName, db);
            return db;
        }
        else{
            System.out.println("Читаем БД из cache");
            return cache.get(dbName);
        }
    }
}
