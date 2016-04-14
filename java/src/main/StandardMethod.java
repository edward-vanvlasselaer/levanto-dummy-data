package main;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StandardMethod {
    public static String getInsertStatement(Class clazz){
        StringBuilder sb = new StringBuilder();
        String properties = StringUtils.join(Arrays.asList(clazz.getDeclaredFields()),",").toString();
        String values = generateValues(clazz);
        sb.append("INSERT INTO ");
        sb.append(clazz.getSimpleName().toLowerCase());
        sb.append(" (");
        sb.append(properties);
        sb.append(") VALUES (");
        sb.append(values);
        sb.append(");");
        return sb.toString();
    }

    private static String generateValues(Class clazz){
        StringBuilder sb = new StringBuilder();
        for (Field f: clazz.getDeclaredFields()) {
            if (String.class.isAssignableFrom(f.getType())){ //if field is a String
                String s = "";
                sb.append("\"");
                sb.append(s);
                sb.append("\"");
            } else if (Date.class.isAssignableFrom(f.getType())){ //if field is a Date / TIMESTAMP
                Date dt = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ffffff");
                sb.append(sdf.format(dt));
            } else if (Integer.class.isAssignableFrom(f.getType())){ //if field is an Integer
                Integer i = null;
                //check for pk
                //generate random int
                sb.append(i.toString());
            }
            sb.append(",");
        }
        final int length = sb.length();
        if ( length > 0 ) {
            sb.deleteCharAt( length - 1 );// remove last comma
        }
        return sb.toString();
    }
}

