package allAboutConstructor;

public class Stack {

    private int[] arr;
    private int top;

    /**
     * when empty constructor called then a stack of max size 1000 is initialized and top is -1 since o element in stack
     */
    public Stack() {
        this.arr = new int[1000];
        this.top = -1;
    }

    /**
     * constructor to initialize stack with given array and updating the top
     * @param arr
     */
    public Stack(int[] arr){
        this.arr = new int[1000];
        for (int i=0; i<arr.length; i++){
            this.arr[i] = arr[i];
        }
        this.top = arr.length-1;
    }

    /**
     * copy constructor : copies object to current object
     * @param s
     */
    public Stack(Stack s){
        this.arr = s.arr;
        this.top = s.top;
    }

    public void push(int x){
        top++;
        arr[top] = x;
    }

    public void pop(){
        top--;
    }
}

/**
 * Default constructor : No args constructor and all instance variable assigned to default values
 * constructor overloading
 * copy constructor
 */
