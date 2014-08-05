/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.youtube.indianmovies.beans;

import com.youtube.indianmovies.data.Search;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author nareshm
 */

@ManagedBean(name="searchMoviesBean")
@SessionScoped
public class SearchMoviesBean  implements Serializable{

    
   private String searchString;
private  ArrayList<MovieBean> list = null;

    public ArrayList<MovieBean> getList() {
        return list;
    }

    public void setList(ArrayList<MovieBean> list) {
      
       
        this.list = list;
    }
    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        
        getMovies();
        this.searchString = searchString;
    }
    public void getMovies(){
               
        if("".equals(searchString) || searchString ==null){
		
	   }else{
		Search s=new Search();
              list=new ArrayList();
                for ( String key : s.getMovies(searchString).keySet() ) {
                   list.add(new MovieBean(key));
                }
             
	   }
      
        
    }
}
