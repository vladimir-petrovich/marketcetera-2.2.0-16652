package org.marketcetera.core;

/**
 * @author Graham Miller
 * @version $Id: ViolatedClass.java 16154 2012-07-14 16:34:05Z colin $
 */
@ClassVersion("$Id: ViolatedClass.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
class ViolatedClass{

    public static final String HIDDEN_VALUE = "hiddenValue"; //$NON-NLS-1$
    private String hidden = HIDDEN_VALUE;
    private int YOU_CANT_READ_ME = 7;
    private String youCantCallMe(String arg){
        return ("You don't know if I know "+arg); //$NON-NLS-1$
    }
    private String youCantGetMyException() throws Exception{
        throw new Exception();
    }

    public void dontCallMe() throws Exception {
        youCantCallMe(""); //$NON-NLS-1$
        youCantGetMyException();
    }
    
    private void doSomethingWithTwoBooleans(boolean a, boolean b){
    	
    }
}
