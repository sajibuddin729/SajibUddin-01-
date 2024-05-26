package Qestion2;

public class CloudPipeline extends DataPipeline {
    @Override
    protected void connect(String URL) {
        System.out.println("Connecting to cloud...");
        // Implement cloud connection logic here
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming data for cloud...");
        // Implement data transformation logic here
    }

    @Override
    protected void storeData() {
        System.out.println("Storing data in cloud...");
        // Implement storing data in cloud logic here
    }
}

