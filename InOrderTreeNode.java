/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
          int j[]=new int [100000];  
                  int i=0;
    public int[] inorderTraversal(TreeNode A) {
        if(A==null){
            return j;
        }
        inorderTraversal(A.left);
        if(A.val!=0){
j[i++] =A.val;
        }
        inorderTraversal(A.right);
        int k[]=new int[i];
        for(int l=0;l<i;l++){
k[l]=j[l];

        }
        return k;
                

    }
}
