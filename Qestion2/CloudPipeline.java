package Qestion2;

public class CloudPipeline extends DataPipeline {
    @Override
    protected void connect(String URL) {
        System.out.println("Connecting to cloud...");
        // Implement clo
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming data for cloud...");
        // Implement 
    }

    @Override
    protected void storeData() {
        System.out.println("Storing data in cloud...");
        // Implement 
    }
}

