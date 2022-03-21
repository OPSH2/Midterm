package com.example.myapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class XeDapAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<XeDap> listxedap;

    public XeDapAdapter(Context context, int layout, List<XeDap> listxedap) {
        this.context = context;
        this.layout = layout;
        this.listxedap = listxedap;
    }

    @Override
    public int getCount() {
        return listxedap.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        TextView txtten = (TextView) view.findViewById(R.id.textviewten);
        TextView txtgia = (TextView) view.findViewById(R.id.textViewGia);
        TextView txtgiacu = (TextView) view.findViewById(R.id.textviewgiacu);
        ImageView imgsp = (ImageView) view.findViewById(R.id.imageViewsanpham);
        XeDap xeDap = listxedap.get(i);
        txtten.setText(xeDap.getTxtten());
        txtgia.setText(xeDap.getTxtgia());
        txtgiacu.setText(xeDap.getTxtgiagoc());
        imgsp.setImageResource(xeDap.getSanpham());
        return view;
    }
}
