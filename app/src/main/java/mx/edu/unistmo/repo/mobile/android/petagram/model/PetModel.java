package mx.edu.unistmo.repo.mobile.android.petagram.model;

public class PetModel {

    private String avatar;
    private int bones;
    private String breed;
    private int id;
    private String nickname;

    public PetModel(int id, String nickname, String breed, String avatar, int bones) {
        this.avatar = avatar;
        this.bones = bones;
        this.breed = breed;
        this.id = id;
        this.nickname = nickname;
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

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickname() {
        this.nickname = nickname;
    }
}
