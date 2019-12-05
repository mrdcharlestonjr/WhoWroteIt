package com.example.whowroteit;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class FetchBooks extends AsyncTask<String, Void, String> {

    private WeakReference<TextView> mTitle;
    private WeakReference<TextView> mAuthor;

    public FetchBooks(TextView title, TextView author) {
        mTitle = new WeakReference<>(title);
        mAuthor = new WeakReference<>(author);
    }

    @Override
    protected String doInBackground(String... strings) {
        return NetworkUtils.queryBook(strings[0]);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
