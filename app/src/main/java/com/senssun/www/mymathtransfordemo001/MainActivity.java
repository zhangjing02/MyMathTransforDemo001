package com.senssun.www.mymathtransfordemo001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  private String longSitMsg="LongSit{startHour=5, startMinute=17, endHour=3, endMinute=10, interval=43, repeat='10010100'}";
    private static final String TAG = "ttttttttttt";
    private ArrayList<String>list=new ArrayList<>();

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        list.add("15");
//        list.add("17");
//        list.add("3");
//        list.add("10");
//        list.add("43");
//        list.add("10010100");
//        Log.i(TAG, "onCreate: 集合的内容是？ "+list.toString());
//
//        AppsLocalConfig.saveConfig(MainActivity.this, "CZJK_smart", "longSitMsg", list.toString(), AppsLocalConfig.STRING_TYPE, true);

      String msg= (String) AppsLocalConfig.readConfig(MainActivity.this, "CZJK_smart", "longSitMsg","1111111",AppsLocalConfig.STRING_TYPE);

        Log.i(TAG, "onCreate: 获取的闹钟信息是？"+msg);
       String[]xx= msg.replace("[","").replace("]","").split(",");
        for (int i = 0; i <xx.length ; i++) {
            Log.i(TAG, "onCreate: 每一个内容是？"+xx[i]);
        }
    }
}
