package com.jungmin.adjacentsister;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.HashMap;

public class SessionManager {

        SharedPreferences sharedPreferences;
        public SharedPreferences.Editor editor;
        public Context context;
        int PRIVATE_MODE = 0;

        private  static  final String PREF_NAME = "LOGIN";
        private  static  final String LOGIN = "IS_LOGIN";
        public static  final String NAME = "NAME";
        public static final String PASS = "PASS";
        //public static final String AGE ="AGE";

        public SessionManager(Context context){
            this.context = context;
            sharedPreferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
            editor = sharedPreferences.edit();
        }

        public void createSession(String my_id, String my_password){
            editor.putBoolean(LOGIN, true);
            editor.putString(NAME, my_id);
            editor.putString(PASS,my_password);
            editor.apply();
        }

        public boolean isLogin(){
            return sharedPreferences.getBoolean(LOGIN,false);
        }

        public void checkLogin(){
            if(!this.isLogin()){
                Intent i = new Intent(context, LoginActivity.class);
                context.startActivity(i);
                ((MainActivity) context).finish();
            }
        }

        public HashMap<String, String> getUserDetail(){
            HashMap<String, String> user = new HashMap<>();
            user.put(NAME, sharedPreferences.getString(NAME, null));
            user.put(PASS, sharedPreferences.getString(PASS, null));
            return user;
        }

        public void logout(){
            editor.clear();
            editor.commit();
            Intent i = new Intent(context, LoginActivity.class);
            context.startActivity(i);
            ((MainActivity) context).finish();
        }
}
