import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        nodes.add(root);
        while(nodes.size()!=0){
            List<Integer> localres = new ArrayList<>();
            for(TreeNode i:nodes) localres.add(i.val);
            res.add(localres);

            // recompute nodes.
            List<TreeNode> nextNodes = new ArrayList<>();
            for(TreeNode i:nodes) {
                if(i!=null){
                    nextNodes.add(i.left);
                    nextNodes.add(i.right);
                }
            }
            nodes = nextNodes;
        }
        Collections.reverse(res);
        return res;
    }
}
