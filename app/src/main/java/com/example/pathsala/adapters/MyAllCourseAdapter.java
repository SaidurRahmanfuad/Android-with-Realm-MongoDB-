package com.example.pathsala.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pathsala.R;
import com.example.pathsala.model.Course;

import java.util.List;

public class MyAllCourseAdapter extends RecyclerView.Adapter<MyAllCourseAdapter.MACVH> {
    Context context;
    List<Course>courseList;

    public MyAllCourseAdapter(Context context, List<Course> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public MACVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.rv_myallcourse_model,parent,false);
        MACVH macvh=new MACVH(v);
        return macvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MACVH holder, int position) {
        if(courseList!=null)
        {
            Course course=courseList.get(position);
            holder.tv_showCname.setText(course.getCourse_name());
            holder.tv_showCduration.setText(course.getCourse_duration());
            holder.tv_showCtotalclass.setText(course.getTotal_class());
            holder.tv_showCfee.setText(course.getCourse_fee());
        }

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public class MACVH extends RecyclerView.ViewHolder {
        private TextView tv_showCname,tv_showCsub,tv_showCduration,tv_showCtotalclass,tv_showCfee;
        public MACVH(@NonNull View v) {
            super(v);
            tv_showCname=v.findViewById(R.id.tv_showCname);
            tv_showCsub=v.findViewById(R.id.tv_showCsub);
            tv_showCduration=v.findViewById(R.id.tv_showCduration);
            tv_showCtotalclass=v.findViewById(R.id.tv_showCtotalclass);
            tv_showCfee=v.findViewById(R.id.tv_showCfee);
        }
    }
}
