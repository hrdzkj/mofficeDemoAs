package cn.wps.moffice.demo;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by LiuYi on 2019/1/18.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
