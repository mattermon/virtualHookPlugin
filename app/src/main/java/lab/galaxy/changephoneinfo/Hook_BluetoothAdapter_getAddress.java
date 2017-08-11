package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 * Modified by zhangguopeng on 11/08/2017.
 */

public class Hook_BluetoothAdapter_getAddress {
    public static String className = "android.bluetooth.BluetoothAdapter";
    public static String methodName = "getAddress";
    public static String methodSig = "()Ljava/lang/String;";

    public static String hook(Object thiz) {
        Log.i("YAHFA_BluetoothAdapter_getAddress", "getAddress: [" + origin(thiz) + "]");
        return origin(thiz);
    }

    public static String origin(Object thiz) {
        Log.e("YAHFA", "BluetoothAdapter getAddress: should not be here.");
        return "";
    }
}
