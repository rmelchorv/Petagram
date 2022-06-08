package mx.edu.unistmo.repo.mobile.android.petagram.interactor;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import mx.edu.unistmo.repo.mobile.android.petagram.model.PetModel;

public class PetDbHelper extends SQLiteOpenHelper {

    public PetDbHelper(Context context) {
        super(context, PetContract.DB_NAME, null, PetContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /* Setting up the db structure */
        db.execSQL(PetContract.SQL_CREATE_PROFILES);
        db.execSQL(PetContract.SQL_CREATE_RANKS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(PetContract.SQL_DELETE_PROFILES);
        db.execSQL(PetContract.SQL_DELETE_RANKS);
        onCreate(db);
    }

    /* To-do: add bones for pets

    public void addBone() {

    }
     */

    public ArrayList<PetModel> readPetList() {
        String query = "SELECT pp.*, pr.bones FROM " +
                PetContract.PetProfile.TBL_NAME + " AS pp, " +
                PetContract.PetRank.TBL_NAME + " AS pr " +
                "WHERE pp.id = pr.id";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        ArrayList<PetModel> pets = new ArrayList<>();
        while(cursor.moveToNext()) {
            PetModel pet = new PetModel();

            pet.setId(cursor.getLong(cursor.getColumnIndexOrThrow(PetContract.PetProfile._ID)));
            pet.setNickname(cursor.getString(cursor.getColumnIndexOrThrow(PetContract.PetProfile.COL_NAME_NICKNAME)));
            pet.setBreed(cursor.getString(cursor.getColumnIndexOrThrow(PetContract.PetProfile.COL_NAME_BREED)));
            pet.setAvatar(cursor.getString(cursor.getColumnIndexOrThrow(PetContract.PetProfile.COL_NAME_AVATAR)));
            pet.setBones(cursor.getLong(cursor.getColumnIndexOrThrow(PetContract.PetRank.COL_NAME_BONES)));
            pets.add(pet);
        }
        cursor.close();
        db.close();

        return pets;
    }
}
