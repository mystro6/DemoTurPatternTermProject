package com.Command;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;

import com.Factory.User;

@ManagedBean
public class SaveDB extends SaveCommand
{
  @Override
  public void save()
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo-ets",
          "root",
          "62591");
      Statement stat = conn.createStatement();
      
      for(User user: this.invoker.getUsers())
      {
        stat.execute("insert into users(name, pass, email) values('" +
            user.getUsername() + "', '" +
            user.getPasswrd() + "', '" +
            user.getEmail() + "')");
      }
      
      this.invoker.getUsers().clear();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}










