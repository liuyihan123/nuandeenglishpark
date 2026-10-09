package com.nuande.englishpark;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void greetsLearnerAndTrimsName() {
        assertEquals("Welcome to Nuande English Park, Alice!", App.greeting(" Alice "));
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsBlankName() {
        App.greeting("  ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsNullName() {
        App.greeting(null);
    }
}
