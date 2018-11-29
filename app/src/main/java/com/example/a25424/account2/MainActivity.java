package com.example.a25424.account2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView tv;
    private Context mcontext;
    private ListView listView;
    private ArrayAdapter<String> arr_Adapter;
    private SimpleAdapter simp_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcontext=this;
        btn=(Button) findViewById(R.id.btn_record);
        tv=(TextView)findViewById(R.id.tv_yue);

        listView=(ListView)findViewById(R.id.listView);
        String[]arr_data={"慕课网1","慕课网3","慕课网3","慕课网4"};
        arr_Adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr_data);
        listView.setAdapter(arr_Adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mcontext,Recording.class);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==2)
            {
                String yue=data.getStringExtra("yue");
                tv.setText(yue);
            }
        }
    }
}
