public class MainVerb {
    public static void main(String[] args) {
        System.out.println("Pre-Assessment Verb");
            BST bst = new BST();

            bst.insert("took");
            bst.insert("cut");
            bst.insert("put");
            bst.insert("went");
    
            System.out.println("Inorder traversal:");
            bst.inorder();
    
            System.out.println("\nHasil search:");
    
            bst.search("cut");
            bst.search("run");
        }
    }
