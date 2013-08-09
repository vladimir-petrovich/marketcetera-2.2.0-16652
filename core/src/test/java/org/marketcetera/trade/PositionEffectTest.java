package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;
import static org.marketcetera.trade.PositionEffect.*;
import org.marketcetera.core.Pair;
import java.util.Arrays;
import java.util.List;

/* $License$ */
/**
 * Tests {@link PositionEffect}
 *
 * @author anshul@marketcetera.com
 * @version $Id: PositionEffectTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: PositionEffectTest.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class PositionEffectTest extends FIXCharEnumTestBase<PositionEffect> {

    @Override
    protected PositionEffect getInstanceForFIXValue(Character inFIXValue) {
        return PositionEffect.getInstanceForFIXValue(inFIXValue);
    }

    @Override
    protected Character getFIXValue(PositionEffect e) {
        return e.getFIXValue();
    }

    @Override
    protected PositionEffect unknownInstance() {
        return Unknown;
    }

    @Override
    protected List<PositionEffect> getValues() {
        return Arrays.asList(values());
    }
    @Override
    protected List<Pair<PositionEffect,Character>> knownValues() {
        return Arrays.asList(
                new Pair<PositionEffect, Character>(Open, quickfix.field.PositionEffect.OPEN),
                new Pair<PositionEffect, Character>(Close, quickfix.field.PositionEffect.CLOSE)
        );
    }
}