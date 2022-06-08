package mx.edu.unistmo.repo.mobile.android.petagram.interactor;

import android.provider.BaseColumns;

public final class PetContract {

    public static final String DB_NAME = "pets.db";
    public static final int DB_VERSION = 1;

    public static final String SQL_CREATE_PROFILES =
            "CREATE TABLE " + PetProfile.TBL_NAME + " (" +
                PetProfile._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PetProfile.COL_NAME_NICKNAME + " TEXT, " +
                PetProfile.COL_NAME_BREED + " TEXT, " +
                PetProfile.COL_NAME_AVATAR + " TEXT)";
    public static final String SQL_CREATE_RANKS =
            "CREATE TABLE " + PetRank.TBL_NAME + " (" +
                PetRank._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PetRank.COL_NAME_PROFILE_ID + " INTEGER, " +
                PetRank.COL_NAME_BONES + " INTEGER, " +
                "FOREIGN KEY (" + PetRank.COL_NAME_PROFILE_ID + ") " +
                "REFERENCES " + PetProfile.TBL_NAME + "(" + PetProfile._ID + "))";

    public static final String SQL_DELETE_PROFILES =
            "DROP TABLE IF EXISTS " + PetProfile.TBL_NAME;
    public static final String SQL_DELETE_RANKS =
            "DROP TABLE IF EXISTS " + PetRank.TBL_NAME;

    private PetContract() {}

    public static class PetProfile implements BaseColumns {
        public static final String TBL_NAME = "profile";
        public static final String COL_NAME_AVATAR = "avatar";
        public static final String COL_NAME_BREED = "breed";
        public static final String COL_NAME_NICKNAME = "nickname";
    }
    public static class PetRank implements BaseColumns {
        public static final String TBL_NAME = "rank";
        public static final String COL_NAME_BONES = "bones";
        public static final String COL_NAME_PROFILE_ID = "profile_id";
    }
}
