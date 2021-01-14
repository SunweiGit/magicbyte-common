package org.magicbyte.common.utils;

import lombok.Builder;
import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;
import java.net.URL;

/**
 * @author sunwei
 */
@Builder
public class NameUtils {
    /**
     * Camel name string.
     *
     * @param name the name  user_name
     * @return the string  userName
     */
    public static String camelName(String name) {
        StringBuilder result = new StringBuilder();
        if ((name == null) || (name.isEmpty())) {
            return "";
        }
        String s = "_";
        if (!name.contains(s)) {
            return name.toLowerCase();
        }
        String[] camels = name.split(s);
        for (String camel : camels) {
            if (!camel.isEmpty()) {
                if (result.length() == 0) {
                    result.append(camel.toLowerCase());
                } else {
                    result.append(camel.substring(0, 1).toUpperCase());
                    result.append(camel.substring(1).toLowerCase());
                }
            }
        }
        return result.toString();
    }

}
