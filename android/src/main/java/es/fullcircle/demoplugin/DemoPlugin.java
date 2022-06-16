package es.fullcircle.demoplugin;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class DemoPlugin implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor pressure;
    private Sensor light;
    float millibarsOfPressure;
    float lux;


    public void initPlugin(Context context) {
        Log.i("Init", "started");
        sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        pressure = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        sensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(this, pressure, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public float getPressure() {
        Log.i("returning pressure", String.valueOf(millibarsOfPressure));
        return millibarsOfPressure;
    }
    public float getLight() {
        Log.i("returning light", String.valueOf(lux));
        return lux;
    }


    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Do something here if sensor accuracy changes.
    }

    @Override
    public final void onSensorChanged(SensorEvent event) {
        Log.i("changed", String.valueOf( event.values[0] ));
        if (event.sensor.getType() == Sensor.TYPE_PRESSURE) {
            millibarsOfPressure = event.values[0];
        } else {
            lux = event.values[0];
        }
    }

}