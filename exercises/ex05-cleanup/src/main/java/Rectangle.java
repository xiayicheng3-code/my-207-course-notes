/**A rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /** initiates a rectangle.
     *
     * @param w input width.
     * @param h input height
     */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /** Calculate area of this rectangle.
   *
   * @return area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /** scales the rectangle.
   *
   *
   * @param factor scales both width and height by the factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compared one rectangle with another rectangle.
   *
   * @param other Another rectangle to be compared.
   * @return True when this rectangle's area is larger or equal than the parameter.False if smaller.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
