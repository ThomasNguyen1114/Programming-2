public class GridDriver {
    public static void main(String[] args) {

        Grid g = new Grid();
        g.fill(' ');
        g.plot(1,1,'x');
        g.plot(2,2,'o');
        g.show();

    }
}
