package programmingLanguage;

public class ForLoop {

    public void simpleFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public void forEch() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

}
