package ua.vlad.mywishlist;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;

/**
 * Created by 76672 on 07.01.2018.
 */

public class MySettings {


    SharedPreferences SP;
    Context _c;

    public MySettings(Context c){
        _c = c;
    }

    public String getAI(){
        return Settings.Secure.getString(_c.getContentResolver(), Settings.Secure.ANDROID_ID);
    }


    public void StoreString(String name, String value){

    }

    public void StoreInt(String name, int value){

    }

    public String getString(){

      return "";
    }

}
