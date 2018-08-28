package com.boyacx.sowtoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ShowTastActivity extends AppCompatActivity {

    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_tast);


    }


    /**
     * moudle 显示toast
     *
     * @param
     */
    public void ShowToast() {
        Toast.makeText(getApplicationContext(),
                "这个是lib moudle 显示的 toast：moudle", Toast.LENGTH_SHORT).show();

    }


}
