package oopProblem;

public class Box {
    double height, width, depth;

    Box (double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displayVol () {
        System.out.println("Volume of the box is = "+ height * width * depth);
    }
}
