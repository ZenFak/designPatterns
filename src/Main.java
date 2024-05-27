import main.java.neoflex.adapter.Computer;
import main.java.neoflex.adapter.MemoryCard;
import main.java.neoflex.adapter.MemoryCardAdapter;
import main.java.neoflex.adapter.USB;
import main.java.neoflex.factory.CoffeType;
import main.java.neoflex.factory.Facility;
import main.java.neoflex.proxy.DatabaseImpl;
import main.java.neoflex.proxy.DatabaseProxy;
import main.java.neoflex.singelton.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("- Singelton ");
        Logger logger = Logger.getInstance();
        logger.classLog(new String("TestClass"), "TestClass1");
        logger.classLog(null, "TestClass2");


        System.out.println("\n- Factory ");
        Facility facility = new Facility();
        facility.start(CoffeType.AMERICANO);
        facility.start(CoffeType.ESPRESSO);


        System.out.println("\n- Adapter ");
        USB usb = new USB();
        Computer computer = new Computer();
        computer.connect(usb);
        //-------------------------------//
        MemoryCard memoryCard = new MemoryCard();
        MemoryCardAdapter memoryCardAdapter = new MemoryCardAdapter(memoryCard);
        Computer computer1 = new Computer();
        computer1.connect(memoryCardAdapter);


        System.out.println("\n- Proxy ");
        String dbName = "/mydb";
        DatabaseImpl database = new DatabaseImpl();
        DatabaseProxy proxy = new DatabaseProxy(database);
        System.out.println(proxy.connect("localhost:5050", dbName));
        System.out.println(proxy.connect("localhost:5050", dbName));
    }
}