/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import java.util.LinkedList;
import java.util.Collections;

/**
 *
 * @author srodriguez
 */
public class Logic implements Comparable<Logic> {

    private LinkedList data;

    public Logic() {
        this.data = new LinkedList();
    }

    public void addNumber(int number) {
        this.data.add(number);
    }

    public int getData() {
        int i;
        for (i = 0; i < this.data.size(); i++) {
            i += i;
        }
        return i;
    }

    @Override
    public int compareTo(Logic logic) {
        return this.getData() - logic.getData();
    }

    public void printList() {
        if (this.data.isEmpty()) {
            System.out.println("\nThe list is empty, you can add a number.\n");
            return;
        }
        Collections.sort(this.data);
        System.out.println("\nIntegers sorted in ascending order");
        for (int i = 0; i < this.data.size(); i++) {
            System.out.println(this.data.get(i));
        }
    }

    public boolean containNumber(int number) {
        if (!this.data.isEmpty() && this.data.contains(number)) {
            System.out.println("The list already contains the number: " + number);
            return true;
        }
        return false;
    }
}
