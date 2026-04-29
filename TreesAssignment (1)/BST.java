class BST {

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    static boolean search(TreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;

        if (val < root.val)
            return search(root.left, val);
        else
            return search(root.right, val);
    }

    static TreeNode delete(TreeNode root, int val) {
        if (root == null) return null;

        if (val < root.val) root.left = delete(root.left, val);
        else if (val > root.val) root.right = delete(root.right, val);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode successor = minValue(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }
        return root;
    }

    static TreeNode minValue(TreeNode root) {
        while (root.left != null) root = root.left;
        return root;
    }
}
