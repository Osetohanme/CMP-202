public class Processor {

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", noOfcores=" + noOfcores +
                '}';
    }

    String type = "Core I9";

    int noOfcores = 8;
}
