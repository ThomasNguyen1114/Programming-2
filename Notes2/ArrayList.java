public class ArrayList {
    private static final int ALLOCATE = 3;
    private Object[] array;
    private int numObjects;


    public ArrayList(){
        this.array = new Object[ALLOCATE];
        this.numObjects = 0;
    }

    public void add(Object element){
        if(this.numObjects == this.array.length){
            resize();
        }

        this.array[this.numObjects] = element;
        this.numObjects++;
    }

    private void resize(){
        Object[] newArray = new Object[this.array.length + ArrayList.ALLOCATE];
        
        int index;
        for(index = 0; index < this.array.length; index++){
            newArray[index] = this.array[index];
        }

        this.array = newArray;
    }

    public Object get(int index){
        return this.array[index];
    }

    public int size(){
        return this.numObjects;
    }

    public void status(){
        System.out.printf("Allocated: %d\n", this.array.length);
        System.out.printf("Used:      %d\n", this.numObjects);
    }
}
