
class Tree
{
    //Function to return list containing elements of left view of binary tree.
     void fun(Node root,ArrayList<Integer> al,int level){
        if(root==null) return;
        if(level==al.size())    al.add(root.data);
        fun(root.left,al,level+1);
        fun(root.right,al,level+1);
    }
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> leftView(Node node) {
        //add code here.
        ArrayList<Integer> al = new ArrayList<>();
         fun(node,al,0);
         return al;
    }
}
