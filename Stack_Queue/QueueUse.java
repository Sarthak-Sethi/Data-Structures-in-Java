/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

/**
 *
 * @author sarthak sethi
 */
class QueueUse {

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(3);
		for(int i = 1; i <= 5; i++){
			queueUsingArray.enqueue(i);
			try {
				queue.enqueue(i);
			} catch (QueueFullException e) {
				
			}
		}
		
		
		while(! queue.isEmpty()){
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

