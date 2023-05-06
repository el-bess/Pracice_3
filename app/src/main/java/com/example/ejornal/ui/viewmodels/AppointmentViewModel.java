package com.example.ejornal.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.ejornal.data.models.AppointmentModel;
import com.example.ejornal.data.repositories.AppointmentRepository;

import java.util.List;

public class AppointmentViewModel extends ViewModel {
    public LiveData<List<AppointmentModel>> appointment;
    public AppointmentViewModel(){
        AppointmentRepository appointmentRepository = new AppointmentRepository();
        appointment = appointmentRepository.getAppointment();
    }
}
