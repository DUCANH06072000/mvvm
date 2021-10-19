package com.example.mvvm.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm.BR;

public class loginviewmodel extends BaseObservable {
        private String email;
        private String pass;
        @Bindable
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
            notifyPropertyChanged(BR.email);
        }


        @Bindable
        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
            notifyPropertyChanged(BR.pass);
        }
        public void onclick()
        {

        }
    }
