/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.youtube.indianmovies.beans;

import com.youtube.indianmovies.data.Search;
import java.io.Serializable;
import java.util.HashMap;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author nareshm
 */
@Named(value = "searchMoviesBean")
@ManagedBean
@SessionScoped
public class SearchMoviesBean  implements Serializable{

    
   private String searchString;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
        
        
    }
    public HashMap<String,String> getMovies(){
        if("".equals(searchString) || searchString ==null){
		return null;
	   }else{
		Search s=new Search();
             return   s.getMovies(searchString);
	   }
      
        
    }
}
