/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4puneetshetty;

/**
 *
 * @author shett
 */
public class ContactManager {
    private Contact[] contactList;

    public ContactManager() {
        contactList = new Contact[0];
    }

    /*
     Locate a Contact record that matches the email address provided.
     Returns the Contact record if found, null if not found.
    */
    public Contact findContact(String emailAddress) {
        if (contactList != null) {
            for (Contact contact : contactList) {
                if (contact != null && contact.getEmailAddress().equals(emailAddress)) {
                    return contact;
                }
            }
        }
        return null;
    }

    /*
     Removes all contacts
    */
    public void clearContacts() {
        contactList = new Contact[0];
    }

    /*
     Add a new contact to contact list
    */
    public void addContact(Contact newContact) {
        if (newContact == null) {
            return;
        }
        Contact[] newContactList = new Contact[contactList.length + 1];
        System.arraycopy(contactList, 0, newContactList, 0, contactList.length);
        newContactList[contactList.length] = newContact;
        contactList = newContactList;
    }
}

