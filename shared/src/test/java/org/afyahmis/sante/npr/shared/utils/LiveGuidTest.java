package org.afyahmis.sante.npr.shared.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;


public class LiveGuidTest {
    private static Logger logger = LogManager.getLogger();

    @Test
    public void should_generate_newId() {
        UUID idA=LiveGuid.NewId();
        UUID idB=LiveGuid.NewId();
        Assert.assertNotEquals(idA,idB);
        logger.debug(idA);
        logger.debug(idB);
    }

    @Test
    public void should_generate_random() {
        UUID idA=LiveGuid.Random();
        UUID idB=LiveGuid.Random();
        Assert.assertNotEquals(idA,idB);
        logger.debug(idA);
        logger.debug(idB);
    }
}