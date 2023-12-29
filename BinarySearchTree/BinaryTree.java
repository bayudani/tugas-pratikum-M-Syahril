package BinarySearchTree;

//  * Kelas Node digunakan untuk merepresentasikan sebuah node dalam pohon biner.
//  * Setiap node memiliki data dan dua anak: kiri dan kanan.

class nodee {
    int data; // Data yang disimpan dalam nodee
    nodee left, right; // Anak kiri dan anak kanan dari nodee

    public nodee(int data) {
        this.data = data;
        left = right = null;
    }
}

/**
 * Kelas BinaryTree digunakan untuk merepresentasikan sebuah pohon biner.
 */
public class BinaryTree {

    nodee root; // Akar dari pohon biner

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen dari command line (tidak digunakan)
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Membuat objek pohon biner

        // Membuat nodees
        tree.root = new nodee(1);
        tree.root.left = new nodee(2);
        tree.root.right = new nodee(3);
        tree.root.left.left = new nodee(4);
        tree.root.left.right = new nodee(5);
        tree.root.right.left = new nodee(6);
        tree.root.right.right = new nodee(7);
        tree.root.left.left.left = new nodee(8);
        tree.root.left.right.left = new nodee(9);
        tree.root.right.left.left = new nodee(10);

        // Print tree untuk verifikasi
        printTree(tree.root, "", true);
    }

    /**
     * Metode untuk mencetak struktur pohon biner.
     *
     * @param nodee   nodee yang akan dicetak
     * @param indent Indentasi yang digunakan untuk mencetak
     * @param last   Menandakan apakah nodee adalah nodee terakhir dalam tingkatannya
     */
    public static void printTree(nodee nodee, String indent, boolean last) {
        if (nodee != null) {
            System.out.println(indent + "+-- " + nodee.data); // Mencetak data nodee
            indent += last ? "    " : "|   "; // Menyesuaikan indentasi
            printTree(nodee.right, indent, false); // Mencetak anak kanan
            printTree(nodee.left, indent, true); // Mencetak anak kiri
        }
    }
}
