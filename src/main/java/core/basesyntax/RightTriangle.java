package core.basesyntax;

public class RightTriangle extends Figure implements Perimeter {
    protected int sideLengthA;
    protected int sideLengthB;

    @Override
    public int getArea() {
        return sideLengthA * sideLengthB / 2;
    }

    @Override
    public int getPerimeter() {
        return sideLengthA + sideLengthB + getHypotenuse();
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: RightTriangle, area: "
                + getArea() + " sq. units, hypotenuse: "
                + getHypotenuse() + " units, perimeter: "
                + getPerimeter() + " units, side length B: "
                + sideLengthB + " units, side length A: "
                + sideLengthA + " units, color: " + color);
    }

    public int getHypotenuse() {
        return (int) Math.sqrt(sideLengthA * sideLengthA + sideLengthB * sideLengthB);
    }

    public int getSideLengthB() {
        return sideLengthB;
    }

    public int getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(int sideLengthA) {
        this.sideLengthA = sideLengthA;
    }

    public void setSideLengthB(int sideLengthB) {
        this.sideLengthA = sideLengthB;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
