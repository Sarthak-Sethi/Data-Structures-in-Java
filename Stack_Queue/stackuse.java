/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

/**
 *
 * @author sarthak sethi
 */
public class stackuse {

	public static void main(String[] args) throws StackFullException {		
		stack_using_array stack = new stack_using_array(3);
		for(int i = 1; i <= 5; i++){
			stack.push(i);
		}
		
		while(!stack.isEmpty()){
			try {
				System.out.println(stack.pop());
                            } 
                        catch (StackEmptyException e) 
                        {
				// Never reach here
			}
		}

	}

}
