package programmingLanguage;

public enum Enum {

    // Enum Exemple
    one  ("1"),
    two  ("2") ,
    three("3");


    private final String string;

    private Enum(final String string) {
        this.string = string;
    }


    public String getEnumFromList() {
        return string;
    }
}
