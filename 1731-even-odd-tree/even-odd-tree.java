class Solution {
    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {

            int size = q.size();
            int previous = (level % 2 == 0)
                    ? Integer.MIN_VALUE
                    : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                int val = node.val;

               
                if (level % 2 == 0) {
                    
                    if (val % 2 == 0 || val <= previous) return false;
                }
                // ODD 
                else {
                    
                    if (val % 2 != 0 || val >= previous) return false;
                }

                previous = val;

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            level++; 
        }

        return true;
    }
}
