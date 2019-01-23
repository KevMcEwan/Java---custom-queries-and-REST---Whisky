package com.codeclan.example.WhiskyTracker.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "distilleries")
public class Distillery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "region")
    private RegionType region;

    @OneToMany(mappedBy = "distillery", fetch = FetchType.LAZY)
    private List<Whisky> whiskies;

    public Distillery(String name, RegionType region ) {
        this.name = name;
        this.region = region;
        this.whiskies = new ArrayList<>();
    }

    public Distillery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region.getName();
    }

    public void setRegion(RegionType region) {
        this.region = region;
    }

    public List<Whisky> getWhiskies() {
        return whiskies;
    }

    public void setWhiskies(List<Whisky> whiskies) {
        this.whiskies = whiskies;
    }
}

