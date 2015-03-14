package com.damianhinch.fremder;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FremdAdapter extends Adapter<FremdAdapter.ViewHolder> {

    private String[] fremdNames;  // Just holding the names of the Fremds for now

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName;

        public ViewHolder(TextView textViewName) {
            super(textViewName);
            this.textViewName = textViewName;
        }

    }

    public FremdAdapter(String[] fremdNames) {
        this.fremdNames = fremdNames;
    }

    @Override
    public FremdAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType)
    {
        // create a new view
        TextView view = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.textViewName.setText(fremdNames[position]);
    }

    @Override
    public int getItemCount() {
        return fremdNames.length;
    }
}
