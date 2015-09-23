package com.tutorial.entity;

import org.springframework.stereotype.Service;

/**
 * Created by test on 9/23/2015.
 */

@Service
public class BlogEntry {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
