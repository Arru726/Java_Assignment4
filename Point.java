class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public static double distance(Point a1, Point a2) {
        return Math.sqrt(Math.pow((a1.x - a2.x), 2) + Math.pow((a1.y - a2.y), 2));
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
