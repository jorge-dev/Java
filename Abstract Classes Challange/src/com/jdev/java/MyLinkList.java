package com.jdev.java;

public class MyLinkList implements NodeList {

    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
       return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            // List item is empty, so item becomes the head of list
            this.root = newItem;
            return true;
        }

        ListItem current = this.root;
        while (current != null){
            int compare = (current.compare(newItem));
            if(compare < 0){
                // newItem is greater, move right if possible
                if (current.next() != null){
                    current = current.next();
                }
                else{
                    //there is no next, so insert at the end of the list
                    current.setNext(newItem).setPrevious(current);
                    return true;
                }

            }
            else if (compare > 0){
                //newItem is less, so set before
                if (current.previous() != null){
                    current.previous().setNext(newItem).setPrevious(current.previous());
                    newItem.setNext(current).setPrevious(newItem);
                }
                else {
                    // the node without the previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;

                }
                return true;

            }
            else {
                // they are equal
                System.out.println(newItem.getValue() + " is already in the list. Item not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null){
            System.out.println("Deleting Item " + item.getValue());
        }

        ListItem current = this.root;

        while (current != null){
            int compare = current.compare(item);
            if (compare  == 0){
                // item found
                if (current == this.root){
                    this.root = current.next();
                }
                else{
                    current.previous().setNext(current.next());
                    if (current.next() != null);
                    current.next().setPrevious(current.previous());
                }
                return true;
            }
            else if (compare < 0){
                current = current.next();
            }
            else{
                // we are at an item greater than the one to be deleted so item is not in list
                return false;
            }
        }

        return false ;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("List is empty");
        }
        else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }


    }


}

