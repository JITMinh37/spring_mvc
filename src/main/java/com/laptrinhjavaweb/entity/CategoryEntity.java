package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity{

    @Column(name = "name", columnDefinition = "TEXT")
    private String name;
    @Column(name = "code", columnDefinition = "TEXT")
    private String code;

    @OneToMany(mappedBy = "category")
    private List<NewsEntity> news = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<NewsEntity> getNews() {
        return news;
    }

    public void setNews(ArrayList<NewsEntity> news) {
        this.news = news;
    }
}
