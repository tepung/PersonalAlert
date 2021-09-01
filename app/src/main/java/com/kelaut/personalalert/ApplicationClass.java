package com.kelaut.personalalert;

import android.app.Application;
import com.onesignal.OneSignal;


public class ApplicationClass extends Application {
    private static final String ONESIGNAL_APP_ID = "df2922ba-669e-4495-a2e6-ebde08267b27";

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: Add OneSignal initialization here

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId("df2922ba-669e-4495-a2e6-ebde08267b27");



    }
}
