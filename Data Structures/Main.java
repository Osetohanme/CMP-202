 public class Main{

    void addNumber(int a, int b){
        System.out.println(a+b);
    }
     public static void main(String[] args) {

        Main main = new Main();
        main.addNumber(5, 8);
         Computer computer = new Computer(new RAM(), new Processor(), new Storage());
         System.out.println(computer);


     }


 }