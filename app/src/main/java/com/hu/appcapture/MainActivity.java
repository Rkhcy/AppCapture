package com.hu.appcapture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        AppListAdapter adapter = new AppListAdapter(getAppList());
        mRecyclerView.setAdapter(adapter);
    }

    private List<AppInfo> getAppList() {
        List<ApplicationInfo> installed = getPackageManager().getInstalledApplications(0);
        List<AppInfo> appInfoList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : installed) {
            AppInfo appInfo = new AppInfo();
            appInfo.setName(applicationInfo.packageName);
            appInfo.setIcon(applicationInfo.loadIcon(getPackageManager()));
            appInfoList.add(appInfo);
        }
        return appInfoList;
    }
}