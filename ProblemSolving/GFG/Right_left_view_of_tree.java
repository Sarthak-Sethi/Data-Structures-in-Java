class Solution { 
    // global list
     static List<Integer> list ;
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<>();
        getRightSide(root,0);
        return list;
    }
    public static void getRightSide(TreeNode root, int level) {
        if(root==null)
            return ;
        try {
            // check if there is something on that level,if not
            // add the element
        if(list.get(level)==null)
            list.add(root.val);
        }
        // if exception occurs means that place is empty, so just put the element
        catch(Exception e) {
            list.add(root.val);
        }
        // since we need right side view, we are traversing the opposite, 
        // like Root-> Right->Left
        // if we traverse Root->Left->Right it will get left side view
        getRightSide(root.right,level+1);
        getRightSide(root.left,level+1);
    }
}
