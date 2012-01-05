package org.quick.wizard.persistence.framework.mongo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MongoCollection {
    String name();
}
