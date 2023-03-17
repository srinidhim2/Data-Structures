class Solution{
    public static int findMax(Node root){
        //code here
        if(root==null)  return Integer.MIN_VALUE;
         return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
    }
    public static int findMin(Node root){
        //code here
        if(root==null)
            return  Integer.MAX_VALUE;
        int ans=(int)Math.min(findMin(root.left),findMin(root.right));
        return (Math.min(ans,root.data));
        
    }
}
