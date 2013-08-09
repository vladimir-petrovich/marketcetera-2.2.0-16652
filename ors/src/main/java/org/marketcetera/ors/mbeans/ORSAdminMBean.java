package org.marketcetera.ors.mbeans;

import org.marketcetera.core.ClassVersion;

/**
 * MBean interface for ORS operations.
 * @author toli
 * @version $Id: ORSAdminMBean.java 16154 2012-07-14 16:34:05Z colin $
 */

@ClassVersion("$Id: ORSAdminMBean.java 16154 2012-07-14 16:34:05Z colin $")
public interface ORSAdminMBean {

    /** Sends a {@link quickfix.fix44.UserRequest} message containing the password reset message */
    public void sendPasswordReset(String broker, String oldPassword, String newPassword);

    /**
     * Syncs up the in-memory sessions to reflect the current user
     * definitions in the database.
     */

    public void syncSessions();
}
