package fr.esgi.tpapi;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class FetchBook extends AsyncTask<String, Void, String> {
    private WeakReference<TextView> mTitleText;
    private WeakReference<TextView> mAuthorText;

    @Override
    protected String doInBackground(String... strings) {
        // Network code to query the Books API
        return NetworkUtils.getBookInfo(strings[0]);
    }

    @Override
    protected void onPostExecute(String s) {
        // Code to update the UI with the retrieved book info
    }

    public WeakReference<TextView> getmTitleText() {
        return mTitleText;
    }

    public WeakReference<TextView> getmAuthorText() {
        return mAuthorText;
    }
}
