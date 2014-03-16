package org.apache.cayenne.testdo.testmap.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.testmap.CharPkTestEntity;

/**
 * Class _CharFkTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CharFkTestEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    @Deprecated
    public static final String NAME_PROPERTY = "name";
    @Deprecated
    public static final String TO_CHAR_PK_PROPERTY = "toCharPK";

    public static final String PK_PK_COLUMN = "PK";

    public static final Property<String> NAME = new Property<String>("name");
    public static final Property<CharPkTestEntity> TO_CHAR_PK = new Property<CharPkTestEntity>("toCharPK");

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setToCharPK(CharPkTestEntity toCharPK) {
        setToOneTarget("toCharPK", toCharPK, true);
    }

    public CharPkTestEntity getToCharPK() {
        return (CharPkTestEntity)readProperty("toCharPK");
    }


}