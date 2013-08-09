package org.marketcetera.photon.commons.databinding;

import org.eclipse.core.databinding.conversion.Converter;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * A converter that enforces type safety.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: TypedConverter.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: TypedConverter.java 16154 2012-07-14 16:34:05Z colin $")
public abstract class TypedConverter<S, T> extends Converter {

    /**
     * Constructor.
     * 
     * @param fromType
     *            the from type
     * @param toType
     *            the to type
     */
    public TypedConverter(Class<S> fromType, Class<T> toType) {
        super(fromType, toType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Object convert(Object fromObject) {
        return doConvert((S) fromObject);
    }

    /**
     * Performs the conversion.
     * 
     * @param fromObject
     *            the source value
     * @return the converted value
     */
    protected abstract T doConvert(S fromObject);

}
