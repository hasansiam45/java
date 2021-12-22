package finalKeyword;

public class Student extends University {
    @Override
    void uniInfo() {
        System.out.println("Student Info");
    }

//    @Override
//    void infoFinal () {
//        // cannot override because infoFinal is final method;
//        // it can be inherited but not overridden;
//    }
}
