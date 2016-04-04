package com.atozmak.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * 解决Button抢listView的item的焦点的问题
 * 通过在item的布局文件中加入android:descendantFocusability="blocksDescendants"
 * 就能使得button和item都能够被电击和响应事件了。
 */
public class MainActivity extends AppCompatActivity {

    private ListView lvMy;
    private ListViewAdapter lvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMy = (ListView) findViewById(R.id.lv_my);
        lvAdapter = new ListViewAdapter(this);

        lvMy.setAdapter(lvAdapter);
        lvMy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "item被电击>>>", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
