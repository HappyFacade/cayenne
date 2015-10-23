package org.apache.cayenne.lifecycle.db.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AuditLog was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AuditLog extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> LOG = new Property<String>("log");

    public void setLog(String log) {
        writeProperty("log", log);
    }
    public String getLog() {
        return (String)readProperty("log");
    }

}
