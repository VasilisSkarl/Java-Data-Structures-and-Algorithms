// Η κλάση Binary2 περιέχει υλοποιήσεις μεθόδων για τριανταπύκνωση δυαδικού δέντρου
public class Binary2 {

    // Ορίζουμε την κλάση TreeNode για τους κόμβους του δυαδικού δέντρου
    static class TreeNode {
        int value;
        TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    // Μέθοδος για προδιατεταγμένη μετάβαση (Preorder Traversal)
    public static void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " "); // Εκτύπωση τιμής πρώτα
            preorderTraversal(root.left);       // Στη συνέχεια αριστερό υποδέντρο
            preorderTraversal(root.right);      // Στη συνέχεια δεξί υποδέντρο
        }
    }

    // Μέθοδος για ενδοδιατεταγμένη μετάβαση (Inorder Traversal)
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);        // Πρώτα αριστερό υποδέντρο
            System.out.print(root.value + " "); // Στη συνέχεια εκτύπωση τιμής
            inorderTraversal(root.right);       // Στη συνέχεια δεξί υποδέντρο
        }
    }

    // Μέθοδος για μεταδιατεταγμένη μετάβαση (Postorder Traversal)
    public static void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);      // Πρώτα αριστερό υποδέντρο
            postorderTraversal(root.right);     // Στη συνέχεια δεξί υποδέντρο
            System.out.print(root.value + " "); // Στη συνέχεια εκτύπωση τιμής
        }
    }

    public static void main(String[] args) {
        // Δημιουργία ενός δυαδικού δέντρου με σκοπό τον έλεγχο των μεθόδων
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);

        // Εκτύπωση περιεχομένου δέντρου σε προδιατεταγμένη μορφή
        System.out.println("Preorder Traversal:");
        preorderTraversal(root);

        // Εκτύπωση περιεχομένου δέντρου σε ενδοδιατεταγμένη μορφή
        System.out.println("\nInorder Traversal:");
        inorderTraversal(root);

        // Εκτύπωση περιεχομένου δέντρου σε μεταδιατεταγμένη μορφή
        System.out.println("\nPostorder Traversal:");
        postorderTraversal(root);
    }
}