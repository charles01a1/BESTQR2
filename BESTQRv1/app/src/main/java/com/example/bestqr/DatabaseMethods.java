package com.example.bestqr;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;

public class DatabaseMethods {

    public static DataSnapshot get_dataSnapshot(Task<DataSnapshot> task) {
        while (!task.isComplete() && !task.isSuccessful()) {}

        return task.getResult();
    }

}
