package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.module.Module;
import org.marketcetera.module.ModuleException;
import org.marketcetera.module.ModuleURN;


/* $License$ */

/**
 * Module that claims to be a market data provider, but is not.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: DummyModule.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
public class DummyModule extends Module {

	protected DummyModule(ModuleURN inURN, boolean inAutoStart) {
		super(inURN, inAutoStart);
	}

	@Override
	protected void preStart() throws ModuleException {
	}

	@Override
	protected void preStop() throws ModuleException {
	}

}