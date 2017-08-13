package com.example.android.pets.data;

/**
 * Created by Andrew on 2017.08.12..
 */

import android.provider.BaseColumns;

public final class PetContract {

    private PetContract() {
    }

    public static final class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
