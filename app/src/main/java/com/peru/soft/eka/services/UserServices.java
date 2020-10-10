package com.peru.soft.eka.services;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.peru.soft.eka.util.beans.UserBean;
import com.peru.soft.eka.util.enums.CollectionEnum;

import java.util.HashMap;
import java.util.Map;

public class UserServices implements UserServiceI {

    @Override
    public void addUser(UserBean userBean) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Map<String, UserBean> user = new HashMap<>();
        user.put(userBean.getNumeroRuc() , userBean);

        // Add a new document with a generated ID
        db.collection(CollectionEnum.USERS.getRuta())
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d("TAG", "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("TAG", "Error adding document", e);
                    }
                });
    }
}
