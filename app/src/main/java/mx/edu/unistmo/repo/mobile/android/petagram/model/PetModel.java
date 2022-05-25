package mx.edu.unistmo.repo.mobile.android.petagram.model;

public class PetModel {

    private final String avatar;
    private final int bones;
    private final String breed;
    private final String name;

    public PetModel(String avatar, int bones, String breed, String name) {
        this.avatar = avatar;
        this.bones = bones;
        this.breed = breed;
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public int getBones() {
        return bones;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}
