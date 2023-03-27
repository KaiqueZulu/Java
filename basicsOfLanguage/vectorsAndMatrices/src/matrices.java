public class matrices {
    public static void main(String[] args) {
        int matrice[][] = { { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 } };

        for (int interactor0 = 0; interactor0 < matrice.length; interactor0++) {
            for (int interactor1 = 0; interactor1 < matrice[interactor0].length; interactor1++) {
                System.out.println(
                        "Numbers [" + interactor0 + "] [" + interactor1 + "] = " + matrice[interactor0][interactor1]);
            }
        }

    }

}
