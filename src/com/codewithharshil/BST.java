package com.codewithharshil;



//creates a generic binary search tree class
class BinarySearchTree<A> {

    //the root of the node, which is the middle value
    Node root;

    //this constructor will add a node
    public void addNode(A userNumber){

        Node<A> newNode = new Node<A>(userNumber);

    }//end addNode

// getter and setter method
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public class Node<T>{
        //this generic variable will become the user input either int or fraction
        private T number;

        //nodes that will become the left of right child of a parent node
        Node<T> leftChild;
        Node<T> rightChild;

        //a node constructor that will take a generic input
        Node(T number){
            this.number = number;
        }//end node constructor
    }//end the Node class





}//end binary search tree

