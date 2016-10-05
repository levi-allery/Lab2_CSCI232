// tree.java
// demonstrates binary tree
// to run this program: C>java TreeApp
import java.io.*;
import java.util.*; // for Stack class
////////////////////////////////////////////////////////////////
class Node
{
    public int iData; // data item (key)
    public Node leftChild; // this node's left child
    public Node rightChild; // this node's right child
    public void displayNode() // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print("} ");
    }
} // end class Node
////////////////////////////////////////////////////////////////
class Tree
{
    public Node root; // first node of tree
    // -------------------------------------------------------------
    public Tree() // constructor
    { root = null; } // no nodes in tree yet
    //-------------------------------------------------------------
    public boolean find(int key) // find node with given key
    { // (assumes non-empty tree)
        if(root != null) {
            Node current = root; // start at root
            while (current.iData != key) // while no match,
            {
                if (key < current.iData) // go left?
                    current = current.leftChild;
                else // or go right?
                    current = current.rightChild;
                if (current == null) // if no child,
                    return false; // didn't find it
            }
            return true; // found it
        }
        else{
            return false;
        }
    } // end find()
    // -------------------------------------------------------------
    public void insert(int id)
    {
        Node newNode = new Node(); // make new node
        newNode.iData = id; // insert data
        if(root==null) // no node in root
            root = newNode;
        else // root occupied
        {
            Node current = root; // start at root
            Node parent;
            while(true) // (exits internally)
            {
                parent = current;
                if(id < current.iData) // go left?
                {
                    current = current.leftChild;
                    if(current == null) // if end of the line,
                    { // insert on left
                        parent.leftChild = newNode;
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.rightChild;
                    if(current == null) // if end of the line
                    { // insert on right
                        parent.rightChild = newNode;
                        return;
                    }
                } // end else go right
            } // end while
        } // end else not root
    } // end insert()
    public void inOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }
    // -------------------------------------------------------------

    // -------------------------------------------------------------
} // end class Tree
