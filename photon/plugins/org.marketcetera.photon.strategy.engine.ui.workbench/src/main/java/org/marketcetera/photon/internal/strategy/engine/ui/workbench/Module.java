package org.marketcetera.photon.internal.strategy.engine.ui.workbench;

import static org.ops4j.peaberry.Peaberry.service;

import org.marketcetera.photon.strategy.engine.IStrategyEngines;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.AbstractModule;

/* $License$ */

/**
 * Guice configuration for this bundle.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: Module.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: Module.java 16154 2012-07-14 16:34:05Z colin $")
public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(IStrategyEngines.class).toProvider(
                service(IStrategyEngines.class).single().direct());
    }

}
