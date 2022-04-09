// You are given an array of integers stones where stones[i] is the weight of the ith stone.

// We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

// If x == y, both stones are destroyed, and
// If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
// At the end of the game, there is at most one stone left.

// Return the smallest possible weight of the left stone. If there are no stones left, return 0.


class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) 
            heap.add(i);
        while(heap.size()>1) {
                heap.add(heap.poll()-heap.poll());
        }
        if(heap.size()==0) return 0;
        return heap.poll();
    }
}
