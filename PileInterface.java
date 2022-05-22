
import java.util.*;


        //This is the Pile Interface, where you will find all function prototypes used in MyStack but also
        //in Pile.    


public interface PileInterface<Type>{

    //push is a void function whose sole purpose is to push its given item into the stack.
   void push(Type item);

    //pop is a void function whose sole purpose is to pop the element at the top of the stack and update it.
   void pop();

    //top is a public function who yells out who is at the top of the stack.
   public Type top();
 
    //isEmpty is a boolean function who lets the user know whether or not the stack is empty.
   boolean isEmpty();
}
