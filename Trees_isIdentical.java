
class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node p, Node q)
	{
	    // Code Here
	   // if((root1==null && root2!=null) || (root1!=null && root2==null) || (root1.data != root2.data))    return false;
	    
	   // isIdentical(root1.left,root2.left);
	   // isIdentical(root1.right,root2.right);
	    
	   // return true;
	   if(p==null || q==null)   return p==q;
	   return (p.data == q.data) && (isIdentical(p.left,q.left)) && (isIdentical(p.right,q.right));
	}
	
}
