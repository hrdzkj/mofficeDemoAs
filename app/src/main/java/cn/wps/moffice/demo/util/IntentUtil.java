package cn.wps.moffice.demo.util;

import android.content.Intent;

/**
 * Created by LiuYi on 2019/1/18.
 */


public class IntentUtil {

    //https://blog.csdn.net/shenzhonglaoxu/article/details/42675287
    public static Intent createExplicitFromImplicitIntent(Intent implicitIntent,String packageName)
    {
        implicitIntent.setPackage(packageName);
        return implicitIntent;
    }
}
