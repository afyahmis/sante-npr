package org.afyahmis.sante.npr.shared.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LiveGuidTest {
    Logger logger = LogManager.getRootLogger();

    @Test
    public void should_generate_newId() {
        UUID idA=LiveGuid.NewId();
        UUID idB=LiveGuid.NewId();
        Assert.assertNotEquals(idA,idB);
    }

    @Test
    public void should_generate_random() {
    }
}