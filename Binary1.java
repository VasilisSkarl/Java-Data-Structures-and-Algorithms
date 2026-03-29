// Ο κόμβος του δυαδικού δέντρου
class Node {
    int data;
    Node left, right;

    // Κατασκευαστής του κόμβου
    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// Η κλάση που υλοποιεί το δυαδικό δέντρο
class BinaryTree {
    Node root;

    // Κατασκευαστής του δυαδικού δέντρου
    public BinaryTree() {
        root = null;
    }

    // Ιδιωτική μέθοδος για την εισαγωγή κόμβων
    private Node insert(Node current, int value) {
        if (current == null) {
            // Δημιουργία νέου κόμβου αν ο τρέχων κόμβος είναι null
            return new Node(value);
        }

        // Εάν η τιμή είναι μικρότερη, πηγαίνουμε αριστερά, αλλιώς δεξιά
        if (value < current.data) {
            current.left = insert(current.left, value);
        } else if (value > current.data) {
            current.right = insert(current.right, value);
        }

        return current;
    }    

    // Μέθοδος για την εισαγωγή νέου κόμβου
    public void insert(int value) {
        root = insert(root, value);
    }

    // Ιδιωτική μέθοδος για την ενδοσκόπηση (in-order traversal)
    private void displayInOrder(Node root) {
        if (root != null) {
            // Εκτύπωση αριστερού υποδέντρου, τρέχοντος κόμβου, δεξιού υποδέντρου
            displayInOrder(root.left);
            System.out.print(root.data + " ");
            displayInOrder(root.right);
        }
    }

    // Μέθοδος για την ενδοσκόπηση (in-order traversal)
    public void displayInOrder() {
        displayInOrder(root);
        System.out.println(); // Εκτύπωση νέας γραμμής μετά την ολοκλήρωση
    }
}

// Η κύρια κλάση που περιέχει την συνάρτηση main
public class Binary1 {
    public static void main(String[] args) {
        // Δημιουργία ενός δυαδικού δέντρου
        BinaryTree binaryTree = new BinaryTree();

        // Εισαγωγή τιμών στο δυαδικό δέντρο
        binaryTree.insert(6);
        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(8);
        binaryTree.insert(7);
        binaryTree.insert(9);

        // Ενδοσκόπηση και εκτύπωση των κόμβων
        binaryTree.displayInOrder();
    }
}