class KthLargest {
	// the logic is to keep the size of heap equal to k , so that on top of heap we always have the answer
PriorityQueue<Integer> heap ;
    int k;
    public KthLargest(int k, int[] nums) {
       heap = new PriorityQueue<>();
        this.k = k;
        for(int i : nums) 
            heap.add(i);
	    // suppose you need 3rd largest element, and you have [2,3,4,5,6] so you may pop 2 and 3  
        while(heap.size()>k) heap.poll();
    }
    
    public int add(int val) {
    heap.add(val);
	    // if after adding we dont have size equal to heap, pop wate elements ,
      while(heap.size()>k) heap.poll();
        return heap.peek();
    }
}
