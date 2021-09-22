package com.piko;

import java.util.HashMap;
import java.util.Map;

public final class AppSettings {
    Map<String, Object> settings = new HashMap<>();



    private void init() {
        settings.put("Width", 853);
        settings.put("Height", 480);
        settings.put("Scale", 1);
        settings.put("fps", 60);
        settings.put("fullscreen", false);
    }

    public String getSetting(String key) {
        return settings.get(key).toString();
    }
}
