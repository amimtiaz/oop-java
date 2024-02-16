package com.imtiaz_acedamy.oop_class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.imtiaz_acedamy.oop_class.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.tvDisplay.setText("");

       Employee employee1 = new Employee();
       employee1.name = "Imtiaz";
       employee1.salary = 25000;
       employee1.position = "CEO";

       Employee employee2 = new Employee();
       employee2.name = "JON";
       employee2.salary = 2500;
       employee2.position = "Developer";

        binding.tvDisplay.append("Name: " + employee1.name);
        binding.tvDisplay.append("\nPosition: " + employee1.position);
        binding.tvDisplay.append("\nSalary: " + employee1.salary);

        binding.tvDisplay.append("\n\nName: " + employee2.name);
        binding.tvDisplay.append("\nPosition: " + employee2.position);
        binding.tvDisplay.append("\nSalary: " + employee2.salary);

    }
}