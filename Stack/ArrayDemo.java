public class ArrayDemo {

    public static void main(String[] args) {

        int[] numbersArray = new int[10];
        numbersArray[0] = 17;
        numbersArray[1] = 36;
        numbersArray[2] = 38;
        numbersArray[3] = 77;
        numbersArray[4] = 47;


        for (int i = 0; i<numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

    }
}
