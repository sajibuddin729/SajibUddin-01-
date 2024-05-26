package Qestion2;

public class DataProcessing {
    public static void main(String[] args) {
        DataPipeline dbPipeline = new DatabasePipeline();
        DataPipeline cldPipeline = new CloudPipeline();

        dbPipeline.processData("A  URL");
        cldPipeline.processData("A URL");
    }
}
// Template Method pattern