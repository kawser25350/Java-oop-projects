
package com.mycompany.appoint_managment_system;

/**
 *
 * @author Kawser
 */
public abstract class Person {
    protected String name;
    protected int uniqueID;

    public Person(String name, int uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public abstract void displayDetails();
}