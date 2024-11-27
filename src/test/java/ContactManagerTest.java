/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ice4puneetshetty.Contact;
import com.mycompany.ice4puneetshetty.ContactManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shett
 */
//helloooo

//this is a comment made on the Friend branch
public class ContactManagerTest {
    private ContactManager contactManager;
    private Contact contact1;
    private Contact contact2;

    @BeforeEach
    public void setUp() {
        contactManager = new ContactManager();
        contact1 = new Contact("John", "Doe", "john.doe@example.com");
        contact2 = new Contact("Jane", "Smith", "jane.smith@example.com");
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
    }

    @Test
    public void testFindContact_ExistingEmail() {
        Contact result = contactManager.findContact("john.doe@example.com");
        assertNotNull(result);
        assertEquals("John", result.getFirstName());
        assertEquals("Doe", result.getLastName());
    }

    @Test
    public void testFindContact_NonExistingEmail() {
        Contact result = contactManager.findContact("non.existing@example.com");
        assertNull(result);
    }

    @Test
    public void testFindContact_NullEmail() {
        Contact result = contactManager.findContact(null);
        assertNull(result);
    }

    @Test
    public void testFindContact_EmptyEmail() {
        Contact result = contactManager.findContact("");
        assertNull(result);
    }
}
