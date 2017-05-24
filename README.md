# mi-band-2
This is a very raw communication between Xiaomi Band 2 and Android application using Bluetooth, every communication is not encrypted by Xiaomi so we can sniff the data requested/received from Xiaomi Band device, you can find the UUID of Service, Characteristic and Descriptor on the Internet, here is a very simple UUID to read Heart Rate, Alarm, and Battery Info that I used in this application:

**Basic Service:** 

UUID of Service: 0000fee0-0000-1000-8000-00805f9b34fb

Battery Info Characteristic: 00000006-0000-3512-2118-0009af100700

**Alert Service** 

UUID of Service: 00001802-0000-1000-8000-00805f9b34fb

New Alert Characteristic: 00002a06-0000-1000-8000-00805f9b34fb
 
**Heart Rate Service**

UUID of Service: 0000180d-0000-1000-8000-00805f9b34fb

Measurement Characteristic: 00002a37-0000-1000-8000-00805f9b34fb

Control Characteristic: 00002a39-0000-1000-8000-00805f9b34fb

Descriptor: 00002902-0000-1000-8000-00805f9b34fb

There's so many things you can explore about how MI Band device connect and communicate with your Android device using Bluetooth connection, you can also connect and pairing to device programmatically, but in this simple project, I didn't include pairing code so you must pair your Mi band device first using My Fit application then connect it programmatically (just clone this project to see the example).
