
class Solution {
    //Function to find the height of a binary tree.
    int height(Node root) 
    {
        // code here 
        if(root==null)  return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
}
