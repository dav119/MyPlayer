package ru.tolyan.myplayer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tolyan on 02.02.2016.
 */
public class SongAdapter extends ArrayAdapter<Song> {

    private ArrayList<Song> songs;
    private LayoutInflater songInf;
    private static String LOG_CAT = "LOG_CAT";

    public SongAdapter(Context context, ArrayList<Song> songArrayList) {
        super(context, 0, songArrayList);
        songs=songArrayList;
        songInf=LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to song layout
        LinearLayout songLay = (LinearLayout)songInf.inflate
                (R.layout.song, parent, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
        TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
        //get song using position
        Song currSong = songs.get(position);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        //set position as tag
        songLay.setTag(position);
        //Log.d(LOG_CAT, Integer.toString(position));
        return songLay;
    }

    @Override
    public int getCount() {
        return songs.size();
    }
}
