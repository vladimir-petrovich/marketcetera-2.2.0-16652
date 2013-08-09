package org.marketcetera.core;

@ClassVersion("$Id: Clock.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public interface Clock {

	public abstract long getTime();

	public abstract long getApproximateTime();

}
