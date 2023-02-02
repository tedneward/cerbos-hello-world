/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.newardassociates.cerbosdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void byDefaultNoGreetingCanBeSeen() {
        App app = new App();
        // Roll with default user

        assertNotNull(app.getGreeting(), "app should have a greeting");
        assertEquals(app.getGreeting(), "You are not authorized to view this greeting!");
    }

    @Test void userCanReadGreeting() {
        App app = new App();
        app.user = new User("john", "user");

        assertEquals(app.getGreeting(), "Hello world!");
    }

    @Test void adminCanReadAndUpdateGreeting() {
        App app = new App();
        app.user = new User("john", "admin");

        assertEquals(app.getGreeting(), "Hello world!");
        assertEquals(app.setGreeting("Howdy!"), "Howdy!");
        assertEquals(app.getGreeting(), "Howdy!");
    }
}