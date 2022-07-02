package org.example.familytree.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Util class for create new id for PersonNode objects.
 *
 * @author Aleksei_Bulatov
 */
public class IdentifierUtil {

    private static AtomicInteger id;

    public static Integer getNextId() {
        return id.incrementAndGet();
    }
}
