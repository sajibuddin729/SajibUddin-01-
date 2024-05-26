package Qestion2;

public class DatabasePipeline extends DataPipeline {
    @Override
    protected void connect(String URL) {
        System.out.println("Connecting to database...");
        // Implement database connection logic here
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming data for database...");
        // Implement data transformation logic here
    }

    @Override
    protected void storeData() {
        System.out.println("Storing data in database...");
        // Implement storing data in database logic here
    }
}
