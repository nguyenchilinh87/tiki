package tiki.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author LINHNC*/
public class Attribute {

    static public final String DESCRIPTION = "description";
    static public final String ORIGIN = "origin";
    static public final String FACTORY_DATE = "factory_date";
    static public final String WEIGHT = "weight";
    static public final String COLOR = "color";
    static public final String SIZE = "size";
    public static final String STORAGE = "storage";

    private Map<String, Object> data;

    public Attribute() {
        data = new HashMap<>();
    }

    // for load array byte from database
    public void loadData(byte[] input, int len) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(input, 0, len);
                ObjectInputStream in = new ObjectInputStream(bis);) {
            data = (Map<String, Object>) in.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Attribute.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public <T> T getAttrByName(String attrName, Class<T> clzz) {
        if (data == null) {
            return null;
        }
        return (T) data.get(attrName);
    }

    public void setAttr(String attrName, Object attributeValue) {
        if (data == null) {
            data = new HashMap<>();
        }
        data.put(attrName, attributeValue);
    }

    // two option store db
    //1. for store to database as array byte
    public byte[] toByteArray() {
        byte[] ret = null;
        if (data == null) {
            return ret;
        }
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream os = new ObjectOutputStream(bos);) {
            os.writeObject(data);
            os.flush();
            ret = bos.toByteArray();
        } catch (IOException ex) {
            Logger.getLogger(Attribute.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    //2. for store to database as text json
    public String toJson() {
        String text = null;
        if (data == null) {
            return text;
        }
        // use Gson lib or general by hand!
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (String key : data.keySet()) {
            sb.append("\"");
            sb.append(key);
            sb.append("\":");
            sb.append("\"");
            sb.append(data.get(key));
            sb.append("\",");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toJson();
    }

}
