package com.Command;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.Factory.User;

@ManagedBean
public class SaveInvoker
{
  private ArrayList<User> users;

  public ArrayList<User> getUsers()
  {
    return users;
  }

  public void setUsers(ArrayList<User> users)
  {
    this.users = users;
  }
  
  public void saveProducts()
  {}
}
