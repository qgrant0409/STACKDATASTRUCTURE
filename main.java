public class main{
    public static void main(String[] args) {
      
     stack stk = new stack(6);

     stk.push(10);
     stk.peek();
     stk.push(20);
     stk.peek();
     stk.push(30);
     stk.push(40);
     stk.push(50);
     stk.peek();
     stk.push(60);
     stk.pop();
     stk.peek();

    }
}