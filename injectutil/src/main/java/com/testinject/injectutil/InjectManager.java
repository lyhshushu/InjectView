package com.testinject.injectutil;

import android.app.Activity;

import java.lang.reflect.Method;

public class InjectManager {
    public static void inject(Activity activity) {
        injectContentView(activity);
    }

    private static void injectContentView(Activity activity) {
        Class<? extends Activity> clazz = activity.getClass();
        InjectView contentView = clazz.getAnnotation(InjectView.class);
        if (contentView != null) {
            int layoutId = contentView.value();
            try {
                Method method = clazz.getMethod("setContentView", int.class);
                method.invoke(activity, layoutId);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
