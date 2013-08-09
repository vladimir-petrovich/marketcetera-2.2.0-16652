package org.marketcetera.core;

import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Graham Miller
 * @version $Id: ClassVersion.java 16154 2012-07-14 16:34:05Z colin $
 */
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassVersion
{
    String value();
}
