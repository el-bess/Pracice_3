package com.example.ejornal.data.sources;

import androidx.lifecycle.LiveData;

import com.example.ejornal.data.models.AppointmentModel;

import java.util.List;

public class AppointmentDataSource {
    private static final String krujok[] = {"Рисование", "Скрипка", "Хор"};
    public static String getKrujok(int index){
        return krujok[index];
    }

    public static LiveData<List<AppointmentModel>> createAppointmentList() {
        return null;
    }
}
