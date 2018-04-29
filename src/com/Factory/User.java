package com.Factory;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User implements Product
{
  private String username;
  private String email;
  private String passwrd;
  
  public User()
  {}
  
  public User(String username, String email, String passwrd)
  {
    this.username = username;
    this.email = email;
    this.passwrd = passwrd;
  }
  
  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getPasswrd()
  {
    return passwrd;
  }

  public void setPasswrd(String passwrd)
  {
    this.passwrd = passwrd;
  }

  @Override
  public void save()
  {
    
  }
}














