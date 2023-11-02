package com.laptrinhjavaweb.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "status")
    private int status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private RoleEntity role;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "comment",
            joinColumns = {
                    @JoinColumn(name = "userid", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "newid", referencedColumnName = "id")
            })
    private List<NewsEntity> news = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public List<NewsEntity> getNews() {
        return news;
    }

    public void setNews(ArrayList<NewsEntity> news) {
        this.news = news;
    }

    public UserEntity() {
    }

    public UserEntity(String username, String password, String fullname, int status, RoleEntity role) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.status = status;
        this.role = role;
    }
}
