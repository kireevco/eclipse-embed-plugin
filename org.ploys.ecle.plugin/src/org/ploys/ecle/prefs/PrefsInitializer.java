package org.ploys.ecle.prefs;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.ploys.ecle.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PrefsInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PrefKeys.Path.SDK, "C:/Espressif/ESP8266_SDK");
		store.setDefault(PrefKeys.Path.COMPILER, "C:/Espressif/xtensa-lx106-elf");
		store.setDefault(PrefKeys.Path.TOOLS, "C:/Espressif/utils");

		store.setDefault(PrefKeys.Serial.PORT, "COM4");
		store.setDefault(PrefKeys.Serial.SPEED, "230400");
		store.setDefault(PrefKeys.Serial.DATABITS, "8");
		store.setDefault(PrefKeys.Serial.PARITY, "N");
		store.setDefault(PrefKeys.Serial.STOPBITS, "1");

		// store.setDefault(PrefKeys.P_CHOICE, "choice2");
		//store.setDefault(PrefKeys.P_STRING, "Default value");
	}

}
