package com.boyacx.compliepro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 显示lib的 toast
     *
     * @param libStr
     */
    public void showLibToast(String libStr) {
        Toast.makeText(mContext, "这个是lib里面显示的toast:MAIN", Toast.LENGTH_SHORT).show();
    }

}
