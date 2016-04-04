package com.atozmak.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;


/**
 * Created by Mak on 2016/4/4.
 */
public class ListViewAdapter extends BaseAdapter {

    private Context mContext;

    public ListViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_lv_my, null);
            holder.btn = (Button) convertView.findViewById(R.id.btn_my);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "btn被电击", Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }

    public final static class ViewHolder {
        public Button btn;
    }
}
