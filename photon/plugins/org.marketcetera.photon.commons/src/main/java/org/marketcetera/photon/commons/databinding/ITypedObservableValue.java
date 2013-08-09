package org.marketcetera.photon.commons.databinding;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * A strongly typed observable value.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ITypedObservableValue.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: ITypedObservableValue.java 16154 2012-07-14 16:34:05Z colin $")
public interface ITypedObservableValue<T> extends IObservableValue {

    /**
     * Returns the typed value, equivalent to {@link #getValue()}.
     * 
     * @return the typed value
     */
    T getTypedValue();
}