package main.java.neoflex.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DatabaseImpl implements IDatabase{

    @Override
    public String connect(String dbName, String URL) {

        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("./resources/db.txt");
        if(inputStream == null){
            throw new NullPointerException("Файл не найден");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String db;

        try{
            while(((db = bufferedReader.readLine()) != null)){
                if(dbName.equals(db)){
                    System.out.println("Читаем бд из файла");
                    return (db + URL);
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        throw new NullPointerException("БД не найден");
    }
}
