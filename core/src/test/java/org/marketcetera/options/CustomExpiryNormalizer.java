package org.marketcetera.options;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * A test custom expiry normalizer that always appends 01 to an expiry
 * of length 6.
 *
 * @author anshul@marketcetera.com
 * @version $Id: CustomExpiryNormalizer.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: CustomExpiryNormalizer.java 16154 2012-07-14 16:34:05Z colin $")
public class CustomExpiryNormalizer implements OptionExpiryNormalizer {
    @Override
    public String normalizeEquityOptionExpiry(String inExpiry) {
        if(inExpiry.length() == 6) {
            return inExpiry + "01";
        }
        return inExpiry;
    }
}
