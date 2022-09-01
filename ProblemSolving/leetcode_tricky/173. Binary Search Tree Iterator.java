class BSTIterator {
    // striver video hint taken
    // logic, since we always need left first , then root then right,
    // we first store only left elements
    // and when next is called we call for the right elements at that point
Stack<TreeNode> st = new Stack<>();
    public BSTIterator(TreeNode root) {
        // storing only left
         inOrder(root);
    }
    
    public int next() {
        TreeNode node =  st.pop();
        // now that element is opped check, its right and add in stack
        inOrder(node.right);
        return node.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void inOrder(TreeNode root) {
        // adding only left so that space complexity remains equal to heigght of tree
        // we are not storing all elements but only equal to height of tree
        if(root==null)
            return;
         st.add(root);
         inOrder(root.left);
    }
}
