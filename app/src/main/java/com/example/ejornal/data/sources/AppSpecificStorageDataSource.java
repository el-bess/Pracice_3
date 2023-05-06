package com.example.ejornal.data.sources;

import android.content.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppSpecificStorageDataSource {
    private File app_specific_storage_file;

    public AppSpecificStorageDataSource(Context context) {
        File app_specific_directory = context.getFilesDir();
        app_specific_storage_file = new File(app_specific_directory, "user_name.txt");
    }

    public void addAppSpecific(String user_name){
        try {
            FileWriter writer = new FileWriter(app_specific_storage_file);
            writer.write(user_name);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


