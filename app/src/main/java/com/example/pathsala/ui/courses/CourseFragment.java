package com.example.pathsala.ui.courses;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pathsala.R;
import com.example.pathsala.databinding.FragmentCourseBinding;

import io.realm.Realm;

/**
 * create by Saidur Rahman
 */
public class CourseFragment extends Fragment {
private FragmentCourseBinding FCOUbind;

    public CourseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FCOUbind=FragmentCourseBinding.bind(getView());
        // Inflate the layout for this fragment
        View v=FCOUbind.getRoot();

       // return inflater.inflate(R.layout.fragment_course, container, false);


        FCOUbind.tvCreatecourse.setOnClickListener(v1 -> {

        });
        return v;
    }
}