package com.hayukleung.appjni;

/**
 * JNIInterface.java
 * <p>
 * Created by hayukleung on 2/25/16.
 */
public class JNIInterface {

    static {
        System.loadLibrary("app-jni");
    }

    public native String stringFromJNI();
}
