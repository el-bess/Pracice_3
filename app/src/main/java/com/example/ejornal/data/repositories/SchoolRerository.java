package com.example.ejornal.data.repositories;

import androidx.lifecycle.LiveData;

import com.example.ejornal.data.models.SchoolModel;
import com.example.ejornal.data.sources.SchoolDataSource;

import java.util.List;

public class SchoolRerository {
    public LiveData<List<SchoolModel>> getSchool;
    private SchoolModel school;
    public SchoolRerository(){
        int index = 0;
        createSchool(index);
    }
    public String getSchool(){
        return school.getSchool();
    }
    public void createSchool(int index){
        school = new SchoolModel(SchoolDataSource.getScoolNum(index));
    }

}
