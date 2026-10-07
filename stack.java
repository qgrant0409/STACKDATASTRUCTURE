public class stack {

    int  [] vals ;
    int top ;

    stack(int size){
       
        // -1 represents an empty stack
        this.top = -1;
        this.vals = new int [size];

    }

    public boolean isEmpty(){
        if (top== -1){

            return true;

        } else {

            return false;

        }
    }
    public boolean isFull(){

        if(top == vals.length-1){
            
            return true;

        } else {

            return false;

        }
    } 

    public int peek(){
    
        if(isEmpty()){

            return -1;

        } else {

          System.out.println("Peek Value Is: " + vals[top]);
          return vals[top];

        }
    

    }

    public void push(int data){

    if(isFull() == true){

        System.out.println("Stack is full");

    } else {

        System.out.println("Push Successful");
        top = top + 1;
        vals[top] = data;

        }
    }

    public void pop(){

        if(isEmpty() == true){

            System.out.println("Stack is Empty");

        } else {

            top = top-1 ;

        }
    }
}
