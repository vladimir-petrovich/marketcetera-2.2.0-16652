package org.marketcetera.symbology;

/**
 * @author Graham Miller
 * @version $Id: SymbolScheme.java 16154 2012-07-14 16:34:05Z colin $
 */
public enum SymbolScheme {
    BLOOMBERG("B"), RIC("R"), ISIN("I"), SEDOL("S"), HYPERFEED("H"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
    REUTERS_BRIDGE("RB"), BASIC("X"); //$NON-NLS-1$ //$NON-NLS-2$
    String abbrev;

    SymbolScheme(String abbrev)
    {
        this.abbrev = abbrev;
    }
    public String toString(){ return abbrev;}
}
