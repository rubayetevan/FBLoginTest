package com.bdjobs.logintest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rubayet on 07-Aug-16.
 */
public class UserListAdapter extends ArrayAdapter {

    ArrayList<UserProfile> userProfiles = new ArrayList<>();
    Context context;
    LayoutInflater inflater;



    public UserListAdapter(Context context, ArrayList<UserProfile> userProfiles) {
        super(context, R.layout.user_list_layout,userProfiles);
        this.userProfiles = userProfiles;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder userHolder = new ViewHolder();
        if(convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.user_list_layout, parent, false);

            userHolder.nameTV = (TextView) convertView.findViewById(R.id.nameTV);
            userHolder.userNameTV = (TextView) convertView.findViewById(R.id.userNameTV);
            userHolder.userPicIMGV = (ImageView) convertView.findViewById(R.id.userPicIMGV);

            convertView.setTag(userHolder);

        }
        else {
            userHolder= (ViewHolder) convertView.getTag();
        }

        String Name = userProfiles.get(position).getName();
        String UserName = userProfiles.get(position).getUserName();
        String UserPic = userProfiles.get(position).getPicUrl();

        userHolder.nameTV.setText(Name);
        userHolder.userNameTV.setText(UserName);

        return convertView;
    }
    public static class ViewHolder{
        TextView nameTV;
        TextView userNameTV;
        ImageView userPicIMGV;
    }
}
