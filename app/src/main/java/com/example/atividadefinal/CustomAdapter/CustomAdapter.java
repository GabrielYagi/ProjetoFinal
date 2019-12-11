package com.example.atividadefinal.CustomAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.atividadefinal.Model.Player;
import com.example.atividadefinal.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<Player> player;

    public CustomAdapter(Context c, ArrayList<Player> player) {
        this.c = c;
        this.player = player;
    }

    @Override
    public int getCount() {
        return player.size();
    }

    @Override
    public Object getItem(int position) {
        return player.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item, parent, false);

        TextView txtname;
        TextView txtlevel;


        txtname = view.findViewById(R.id.text_name);
        txtlevel = view.findViewById(R.id.text_level);

        Player p = (Player) this.getItem(position);
        //mostra os dados do banco
        txtname.setText("Nick: "+p.getPlayer_name());
        txtlevel.setText("Level: "+p.getPlayer_level());


        return view;
    }
}
