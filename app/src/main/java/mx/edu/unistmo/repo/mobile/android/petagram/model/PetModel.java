package mx.edu.unistmo.repo.mobile.android.petagram.model;

public class PetModel {

    private String avatar;
    private long bones;
    private String breed;
    private long id;
    private String nickname;

    public PetModel() {

    }

    public PetModel(long id, String nickname, String breed, String avatar, long bones) {
        this.avatar = avatar;
        this.bones = bones;
        this.breed = breed;
        this.id = id;
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public long getBones() {
        return bones;
    }

    public String getBreed() {
        return breed;
    }

    public long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setBones(long bones) {
        this.bones = bones;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
