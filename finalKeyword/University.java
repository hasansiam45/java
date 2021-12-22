package finalKeyword;

public class University {
    final String NAME = "Dcc";
    final int FEES; // final blank variable
    static final String DEPARTMENT;

    University () {
        FEES = 200000; // initialized in constructor
    }

    static {
        DEPARTMENT = "CSE";
    }

    void display () {
        System.out.println(NAME);
        System.out.println(FEES);
        System.out.println(DEPARTMENT);
    }

    void uniInfo () {
        System.out.println("University Info");
    }

    final void infoFinal () {
        System.out.println("University Info Final");
    }
}
