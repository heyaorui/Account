package com.example.a25424.account2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Recording extends Activity {
    private Button sure,back;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.recording);

        sure=(Button)findViewById(R.id.btn_sure);
        back=(Button)findViewById(R.id.back);
        edit=(EditText)findViewById(R.id.edit_yue);
        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data=new Intent();
                String yue=edit.getText().toString();
                data.putExtra("yue",yue);
                setResult(2,data);

                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
