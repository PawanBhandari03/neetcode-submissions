public class Codec {
    public String serialize(TreeNode root) {
        if(root == null){
            return "#";
        }
        return root.val + ","
        + serialize(root.left) + "," 
        + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        String[] values = data.split(",");
        for(String value : values){
            queue.offer(value);
        }        
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue){
        String value = queue.poll();
        if(value.equals("#")){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(value));
            node.left = buildTree(queue);
            node.right = buildTree(queue);
        return node;
    }
}
