package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by zhangguopeng on 2017/8/10.
 */

public class Hook_String_toString {
//    public static String className = "android.telephony.gsm.GsmCellLocation";
    public static String className = "java.lang.StringBuilder";
    public static String methodName = "toString";
    public static String methodSig = "()Ljava/lang/String;";
    public static String hook(Object thiz) {
        Log.i("YAHFA_toString", origin(thiz));
        return origin(thiz);
    }

    public static String origin(Object thiz) {
        Log.w("YAHFA", "StringBuilder.toString() should not be here");
        return "";
    }
}
