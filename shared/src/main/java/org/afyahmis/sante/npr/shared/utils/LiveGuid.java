package org.afyahmis.sante.npr.shared.utils;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class LiveGuid {
    public static UUID NewId() {
        return Generators.timeBasedGenerator().generate();
    }

    public static UUID Random() {
        return UUID.randomUUID();
    }
}
