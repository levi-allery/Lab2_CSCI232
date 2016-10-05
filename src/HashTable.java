/**
 * Created by leviallery on 10/5/16.
 */
public class HashTable {
    private Tree[] treeArray;
    private int arraySize;
    public HashTable(int size) {
        treeArray = new Tree[size];
        for (int i = 0; i < treeArray.length; i++) {
            treeArray[i] = new Tree();
        }
        arraySize = size;
    }

    public void insert(int a) {
        int b = hashFunction(a);
        treeArray[b].insert(a);
    }

    public void show() {
        for (int i = 0; i < treeArray.length; i++) {
            System.out.print(i + ". ");
            treeArray[i].inOrder(treeArray[i].root);
            System.out.println();
        }

    }

    public void find(int a) {
        if(treeArray[hashFunction(a)].find(a)){
            System.out.println("Found " + a);
        }
        else {
            System.out.println("Could not find " + a);
        }

    }
    private int hashFunction(int key){
        return key % arraySize;
    }
}

