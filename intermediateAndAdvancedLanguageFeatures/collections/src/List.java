import java.util.ArrayList;

public class List {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listAny = new ArrayList<String>();

        listAny.add("Kaique");
        listAny.add("Bianca");
        listAny.add("Enzo");
        // listAny.add(1);
        // listAny.add(true);
        // listAny.add(1.78);

        for (int iterator = 0; iterator < listAny.size(); iterator++) {
            System.out.println(listAny.get(iterator));
        }

        for (Object object : listAny) {
            System.out.println(object);
        }

    }
}
