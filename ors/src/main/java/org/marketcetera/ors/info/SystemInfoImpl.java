package org.marketcetera.ors.info;

import org.marketcetera.util.misc.ClassVersion;

/**
 * A store for system-wide key-value pairs: implementation.
 *
 * <p>This class is not intended to be thread-safe.</p>
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: SystemInfoImpl.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@ClassVersion("$Id: SystemInfoImpl.java 16154 2012-07-14 16:34:05Z colin $")
public class SystemInfoImpl
    extends ReadWriteInfoImpl
    implements SystemInfo
{

    // CLASS DATA.

    private static final NameGenerator NAME_GENERATOR=
        new NameGenerator("SystemInfo"); //$NON-NLS-1$


    // CONSTRUCTORS.

    /**
     * Creates a new store with an automatically assigned name.
     */

    public SystemInfoImpl()
    {
        this(NAME_GENERATOR.getNextName());
    }

    /**
     * Creates a new store with the given name.
     *
     * @param name The store name.
     */

    public SystemInfoImpl
        (String name)
    {
        super(name);
    }
}
