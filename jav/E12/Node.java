package jav.E12;

public class Node {
    Node left, right;
    int data;
  
    Color color;
    private enum Color {
        RED, BLACK
    }
  
    Node(int data) {
      this.data = data;
      left = null;
      right = null;
      color = Color.RED;
    }

    public boolean isRed() {
        return this.color == Color.RED;
    }

    public void swapColors(Node node) {
        Color temp = node.color;
        node.color = this.color;
        this.color = temp;
    }

    public void changeColor() {
        if (this.color == Color.RED) this.color = Color.BLACK;
        else this.color = Color.RED;
    }

    public void changeColor(boolean data) {
        if (data) this.color = Color.RED;
        else this.color = Color.BLACK;
    }

    public String colorString() {
        if (this.isRed()) {
            return "RED";
        } else {
            return "BLACK";
        }
    }
}
