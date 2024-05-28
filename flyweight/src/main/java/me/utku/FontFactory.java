package me.utku;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String,Font> fonts = new HashMap<String,Font>();

    public Font getFont(String key){
        if(!fonts.containsKey(key)){
            fonts.put(key, new ConcreteFont());
        }
        return fonts.get(key);
    }
}
