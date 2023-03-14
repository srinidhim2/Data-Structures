class Solution{
    void fun(Node root,ArrayList<Integer> al,int level){
        if(root==null) return;
        if(level==al.size())    al.add(root.data);
        fun(root.right,al,level+1);
        fun(root.left,al,level+1);
    }
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> al = new ArrayList<>();
         fun(node,al,0);
         return al;
    }
}

