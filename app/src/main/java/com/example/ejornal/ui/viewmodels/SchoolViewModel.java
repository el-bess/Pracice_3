package com.example.ejornal.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.ejornal.data.models.SchoolModel;
import com.example.ejornal.data.repositories.SchoolRerository;

import java.util.List;

public class SchoolViewModel extends ViewModel {
    private LiveData<List<SchoolModel>> school;

    public SchoolViewModel(){
        SchoolRerository schoolrepository = new SchoolRerository();
        school = schoolrepository.getSchool;
    }

    public LiveData<Object> getSchool() {
        return null;
    }
}
