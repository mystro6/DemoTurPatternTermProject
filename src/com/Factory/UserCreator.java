package com.Factory;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserCreator implements ProductCreator
{
  private String username;
  private String email;
  private String passwrd;
  
  public UserCreator()
  {}
  
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
  public Product createProduct()
  {
    return new User(this.username, this.email, this.passwrd);
  }
}
