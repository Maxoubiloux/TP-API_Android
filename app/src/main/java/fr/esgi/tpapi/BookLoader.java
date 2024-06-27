package fr.esgi.tpapi;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;

import org.jetbrains.annotations.Nullable;

public class BookLoader extends AsyncTaskLoader<String> {
    private final String mQueryString;

    BookLoader(@NonNull Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }
}

