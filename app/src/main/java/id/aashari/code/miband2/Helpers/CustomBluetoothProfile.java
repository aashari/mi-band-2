package id.aashari.code.miband2.Helpers;

import java.util.UUID;

/**
 * Created by aashari on 21/05/17.
 * This profile generated based on http://jellygom.com/2016/09/30/Mi-Band-UUID.html
 */

public class CustomBluetoothProfile {

    public static class Basic {
        public static UUID service = UUID.fromString("0000fee0-0000-1000-8000-00805f9b34fb");
        public static UUID batteryCharacteristic = UUID.fromString("00000006-0000-3512-2118-0009af100700");
    }

}
