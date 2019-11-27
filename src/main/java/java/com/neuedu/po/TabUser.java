package com.neuedu.po;

public class TabUser {
    private Integer id;

    private String email;

    private String password;

    private String nickname;

    private Integer sexId;

    private Integer gradeId;

    private Integer areaId;

    private String sizn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getSizn() {
        return sizn;
    }

    public void setSizn(String sizn) {
        this.sizn = sizn == null ? null : sizn.trim();
    }

	@Override
	public String toString() {
		return "TabUser [id=" + id + ", email=" + email + ", password=" + password + ", nickname=" + nickname
				+ ", sexId=" + sexId + ", gradeId=" + gradeId + ", areaId=" + areaId + ", sizn=" + sizn + "]";
	}
    
}