/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscacao.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Hanzo
 */

@ManagedBean
@ViewScoped
public class PermissController implements Serializable{
    
    public String read (){
    return "display:none;";
    }
    public String edit (){
    return "display:none;";
    }
    public String delete (){
    return "display:none;";
    }
    public String create (){
    return "display:none;";
    }
    
}
