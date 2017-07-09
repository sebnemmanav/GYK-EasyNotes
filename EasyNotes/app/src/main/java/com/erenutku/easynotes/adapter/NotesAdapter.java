package com.erenutku.easynotes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.erenutku.easynotes.R;
import com.erenutku.easynotes.model.NoteModel;

import java.util.ArrayList;

/**
 * Created by sebnem on 08.07.2017.
 */

public class NotesAdapter extends BaseAdapter {
    private ArrayList<NoteModel> mNoteList;
    private Context mContext;
    public NotesAdapter(Context context, ArrayList<NoteModel> noteList){
        mContext = context;
        mNoteList = noteList;
    }
    @Override
    public int getCount() {
        return mNoteList.size();
    }

    @Override
    public Object getItem(int position) {
        return mNoteList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflater.inflate(R.layout.item_notes_layout,null);
        TextView tvTitle = (TextView) rootView.findViewById(R.id.tvTitle);
        TextView tvBody = (TextView) rootView.findViewById(R.id.tvBody);
        tvTitle.setText(mNoteList.get(position).getTitle());
        tvBody.setText(mNoteList.get(position).getBody());
        return rootView;
    }
}
