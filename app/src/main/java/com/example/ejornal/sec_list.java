package com.example.ejornal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;

import com.example.ejornal.databinding.FragmentSecListBinding;

import java.util.ArrayList;
import java.util.List;

public class sec_list extends Fragment {
    FragmentSecListBinding binding;
    Button butt_not;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Channel";
            String description = "Channel FOR NOTIFICATIONS";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("CHANAL", name, importance);
            channel.setDescription(description);
            NotificationManager notificationManager = requireContext().getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
    public sec_list() {
        super(R.layout.fragment_sec_list);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSecListBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }

    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> hobby_arr = new ArrayList<String>();
        for (int i = 0; i < 300; i++) {
            hobby_arr.add("Кружки " + (i + 1));
        }

        MyCustomListViewAdapter listViewAdapter = new MyCustomListViewAdapter(getActivity(), R.layout.itime_sec, hobby_arr);
        binding.listView.setAdapter(listViewAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), hobby_arr.get(i), Toast.LENGTH_SHORT).show();
                Log.i("ListView", hobby_arr.get(i));
            }
        });
        String arguments = getArguments().getString("navigation");
        binding.showLogin.setText(arguments);

        binding.btnNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationCompat.Builder builder = new NotificationCompat.Builder(requireContext(),
                        "CHANNEL")
                        .setSmallIcon(R.drawable.cap)
                        .setContentText("Вы вошли в систему, выберете увлечение дня")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(requireContext());

                //проверяем есть ли разрешение на отправку уведомления
                if (ActivityCompat.checkSelfPermission(getActivity(), android.Manifest.permission.POST_NOTIFICATIONS)
                        != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                // покажись_уведомление
                notificationManager.notify(1, builder.build());
            }
        });
    }
}
