/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.youtube.indianmovies.beans;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author nareshm
 */

@ManagedBean(name="movieBean")
@SessionScoped
public class MovieBean {

    /**
     * Creates a new instance of MovieBean
     * @param name
     */
    public MovieBean(){
        
    }
    public MovieBean(String name) {
        this.name="http://www.youtube.com/embed/"+name;
    }
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "https://www.youtube.com/watch?v="+name;
    }
}
