package org.chitangui.settings.fragments;

import com.android.internal.logging.nano.MetricsProto;

import android.os.Bundle;
import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;

public class NotificationSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.chitang_settings_notification);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.CHITANGUI_SETTINGS;
    }

}
