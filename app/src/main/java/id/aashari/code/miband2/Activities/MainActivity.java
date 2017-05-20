package id.aashari.code.miband2.Activities;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.UUID;

import id.aashari.code.miband2.Helpers.CustomBluetoothProfile;
import id.aashari.code.miband2.R;

public class MainActivity extends Activity {


    BluetoothAdapter bluetoothAdapter;
    BroadcastReceiver broadcastReceiver;

    BluetoothDevice bluetoothDevice;

    Button btnStartConnecting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
        initilaizeComponents();
        initializeEvents();

    }

    void initializeObjects() {
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action.equals(BluetoothDevice.ACTION_FOUND)) {
                    bluetoothDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                    if (bluetoothDevice.getName().equals("MI Band 2")) {
                        startConnecting();
                    }
                }
            }
        };
    }

    void initilaizeComponents() {
        btnStartConnecting = (Button) findViewById(R.id.btnStartConnecting);
    }

    void initializeEvents() {
        btnStartConnecting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDiscovering();
            }
        });
    }

    void startDiscovering() {
        registerReceiver(broadcastReceiver, new IntentFilter(BluetoothDevice.ACTION_FOUND));
        bluetoothAdapter.startDiscovery();
    }

    void stopDiscovering() {
        unregisterReceiver(broadcastReceiver);
        bluetoothAdapter.cancelDiscovery();
    }

    void startConnecting() {
        stopDiscovering();
    }

}
