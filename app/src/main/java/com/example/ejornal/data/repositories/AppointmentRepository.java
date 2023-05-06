package com.example.ejornal.data.repositories;

import androidx.lifecycle.LiveData;

import com.example.ejornal.data.models.AppointmentModel;
import com.example.ejornal.data.sources.AppointmentDataSource;

import java.util.List;

public class AppointmentRepository {
        private LiveData<List<AppointmentModel>> appointments;
        public AppointmentRepository(){
            appointments = AppointmentDataSource.createAppointmentList();
        }
        public LiveData<List<AppointmentModel>> getAppointments(){
            return appointments;
}}
