package org.marketcetera.symbology;

import org.marketcetera.core.ClassVersion;

import java.util.Map;
import java.util.HashMap;

/**
 * @author Graham Miller
 * @version $Id: ExchangeMap.java 16154 2012-07-14 16:34:05Z colin $
 */
@ClassVersion("$Id: ExchangeMap.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class ExchangeMap {
    private SymbolScheme scheme;
    private Map<String, Exchange> schemeToStandardTranslation;
    private Map<String, String> standardToSchemeTranslation = new HashMap<String, String>();

    protected ExchangeMap()
    {
    }

    public ExchangeMap(SymbolScheme scheme, Map<String, Exchange> schemeToStandardTranslation) {
        this.scheme = scheme;
        init(schemeToStandardTranslation);
    }

    protected void init(Map<String, Exchange> schemeToStandardTranslation) {
        this.schemeToStandardTranslation = schemeToStandardTranslation;
        for (String s : schemeToStandardTranslation.keySet()) {
            String key = (String) s;
            standardToSchemeTranslation.put(schemeToStandardTranslation.get(key).getMarketIdentifierCode(), key);
        }
    }


    public SymbolScheme getScheme() {
        return scheme;
    }

    public Exchange getExchange(String schemeName){
        return schemeToStandardTranslation.get(schemeName);
    }

    public String getSchemeName(Exchange exch){
        return standardToSchemeTranslation.get(exch.getMarketIdentifierCode());
    }

    public String getSchemeName(String marketIdentifierCode){
        return standardToSchemeTranslation.get(marketIdentifierCode);
    }
}
