public class forEach {
    public static void main(String[] args) {
        int numbers[] = new int[100];

        for (int interactor = 0; interactor < numbers.length; interactor++) {
            numbers[interactor] = interactor * 2;
        }
        //for (int interactor = 0; interactor < numbers.length; interactor++) {
        //    System.out.println(numbers[interactor]);
        //}

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
