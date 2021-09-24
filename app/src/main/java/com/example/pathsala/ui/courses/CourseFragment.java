package com.example.pathsala.ui.courses;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pathsala.adapters.MyAllCourseAdapter;
import com.example.pathsala.databinding.BottomsheetCourseCreateBinding;
import com.example.pathsala.databinding.FragmentCourseBinding;
import com.example.pathsala.model.Course;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * create by Saidur Rahman
 */
public class CourseFragment extends Fragment {
    Realm realm;
    private FragmentCourseBinding FCOUbind;
    BottomsheetCourseCreateBinding bottombind;
    BottomSheetDialog bottomSheetDialog;

    //Read and show Recyclerview
    List<Course> courseList;
    MyAllCourseAdapter courseAdapter;

    public CourseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FCOUbind = FragmentCourseBinding.inflate(getLayoutInflater());
        View v = FCOUbind.getRoot();
         realm = Realm.getDefaultInstance();
        decorebottomSheet();
        //Create Course Button Click
        FCOUbind.tvCreatecourse.setOnClickListener(v1 -> {
            bottomSheetDialog.show();

            //bottom sheet course save button
            bottombind.btnCoursesave.setOnClickListener(v2 -> {
                //make primary key auto increment
                Number currentIdNum = realm.where(Course.class).max(String.valueOf("course_id"));
                int nextId;
                if (currentIdNum == null) {
                    nextId = 1;
                } else {
                    nextId = currentIdNum.intValue() + 1;
                }

                //Prepare data Model
                Course course = new Course();
                course.setCourse_id(nextId);
                course.setCourse_name(bottombind.tietCoursename.getText().toString());
                course.setCourse_duration(bottombind.tietCourseduration.getText().toString());
                course.setCourse_fee(bottombind.tietCoursefee.getText().toString());
                course.setTotal_class(bottombind.tietTotalclass.getText().toString());

                //Insert data using Transection
                //way-1
           /* realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    Toast.makeText(getActivity(), "Inserted", Toast.LENGTH_SHORT).show();
                    realm.copyToRealm(course);
                    //TODO:for this execution we need to configur in Main/UI thread
                    //RealmConfiguration config = new RealmConfiguration.Builder()
                    //  .allowWritesOnUiThread(true)
                    //  .build()
                }
            });*/

                //Insert data using TransecAsynctask
                //best way-2
                realm.executeTransactionAsync(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        realm.copyToRealm(course);
                    }
                }, new Realm.Transaction.OnSuccess() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(getActivity(), "Inserted", Toast.LENGTH_SHORT).show();
                        ShowAllCourse();
                    }
                }, new Realm.Transaction.OnError() {
                    @Override
                    public void onError(Throwable error) {
                        Toast.makeText(getActivity(), "Error" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            });


        });
        //read data from realm
        ShowAllCourse();
        return v;
    }

    private void ShowAllCourse() {

        courseList=new ArrayList<>();
        courseList=realm.where(Course.class).findAll();
        Log.d("TAG", "ShowAllCourse: "+courseList);
        courseAdapter=new MyAllCourseAdapter(getActivity(),courseList);
        FCOUbind.rvMyallcourse.setLayoutManager(new LinearLayoutManager(getActivity()));
        FCOUbind.rvMyallcourse.setAdapter(courseAdapter);
        courseAdapter.notifyDataSetChanged();
    }

    private void decorebottomSheet() {
        bottomSheetDialog = new BottomSheetDialog(getActivity());
        LayoutInflater.from(getActivity());
        bottombind = BottomsheetCourseCreateBinding.inflate(getLayoutInflater());
        bottomSheetDialog.setContentView(bottombind.getRoot());

    }
}