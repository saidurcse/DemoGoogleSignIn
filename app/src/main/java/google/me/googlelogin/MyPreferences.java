package google.me.googlelogin;

import android.content.Context;
import android.content.SharedPreferences;

import static google.me.googlelogin.Config.USER_EMAIL;
import static google.me.googlelogin.Config.USER_ID;
import static google.me.googlelogin.Config.USER_NAME;

public class MyPreferences {

    private static MyPreferences myPreferences;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    private MyPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences(Config.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();
    }

    public static MyPreferences getPreferences(Context context) {
        if (myPreferences == null) myPreferences = new MyPreferences(context);
        return myPreferences;
    }

        public void setUserId(String userId){
        editor.putString(USER_ID, userId);
        editor.apply();
    }

    public String getUserId(){
        return sharedPreferences.getString(USER_ID, "");
    }

    public void setUserEmail(String userEmail){
        editor.putString(USER_EMAIL, userEmail);
        editor.apply();
    }

    public String getUserEmail(){
         return sharedPreferences.getString(USER_EMAIL, "");
    }

    public void setUserName(String userName){
        editor.putString(USER_NAME, userName);
        editor.apply();
    }

    public String getUserName(){
        return sharedPreferences.getString(USER_NAME, "");
    }

}