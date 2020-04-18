package com.algorithm.askar.string;

import java.util.HashMap;
import java.util.Map;

public class HTMLEntityParser {
    public String entityParser(String text) {
        Map<String, String> m = new HashMap<>();
        m.put("&quot;", "\"");
        m.put("&apos;", "\'");
        m.put("&amp;", "&");
        m.put("&gt;", ">");
        m.put("&lt;", "<");
        m.put("&frasl;", "/");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                String res = "";
                for (; i < text.length(); i++) {
                    if (text.charAt(i) == ';') {
                        res += String.valueOf(text.charAt(i));
                        break;
                    }
                    res += String.valueOf(text.charAt(i));
                }
                if (m.containsKey(res)) {
                    sb.append(m.get(res));
                } else {
                    sb.append(res);
                }
            } else {
                sb.append(text.charAt(i));
            }

        }
        return sb.toString();
    }
}
