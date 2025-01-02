public class Grid {

    public char[][] theArray;
    private int rows;
    private int cols;
    public static final int ROWS = 10;
    public static final int COLS = 10;

    public Grid(){
        theArray = new char[ROWS][COLS];
        rows = ROWS;
        cols = COLS;
    }

    public Grid(int rows, int cols){
        this.setRows(rows);
        this.setCols(cols);
        theArray = new char[this.rows][this.cols];
    }

    private void setRows(int rows){
        if(rows < 0){
            this.rows = Grid.ROWS;
        }else{
            this.rows = rows;
        }
    }

    private void setCols(int cols){
        if(cols < 0){
            this.cols = Grid.COLS;
        }else{
            this.cols = cols;
        }
    }

    public void plot(int row, int col, char ch){
        theArray[row][col] = ch;
    }

    public void fill(char ch){
        int row;
        int col;
        for(row = 0; row < rows; row++){
            for(col = 0; col < cols; col++){
                theArray[row][col] = ch;
            }
        }
    }

    public void show(){
        int row;
        int col;
        for(row = 0; row < 3; row++){
            System.out.print("---");
            for(col = 0; col < 3; col++){
                System.out.print("---");
            }
            System.out.println("---");
            for(col = 0; col < 3; col++){
                System.out.print(" | " + theArray[row][col]);
            }
            System.out.println(" | ");
        }
        System.out.print("---------------");
        System.out.println("");
    }
}
