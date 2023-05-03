package jav.E12;

import jav.Lib_folder.Lib;

/**
 * main
 */
public class main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        int input;
        do {
            Lib.Write("Input Integer: ");

            try {
                tree.root = tree.insert(tree.root, Integer.parseInt(Lib.Take()));
                tree.Print();
            } catch (Exception e) {
                Lib.Write("bye");
                break;

            }

        } while (true);
    }
}
