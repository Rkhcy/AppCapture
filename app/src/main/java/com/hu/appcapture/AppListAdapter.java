package com.hu.appcapture;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AppListAdapter extends RecyclerView.Adapter<AppListAdapter.AppViewHolder> {
    private final List<AppInfo> mList;

    public AppListAdapter(List<AppInfo> list) {
        this.mList = list;
    }

    @NonNull
    @Override

    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AppViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_app_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        AppInfo appInfo = mList.get(position);
        holder.name.setText(appInfo.getName());
        holder.avatar.setImageDrawable(appInfo.getIcon());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class AppViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView avatar;
        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }

}
