package com.Command;

import javax.faces.bean.ManagedBean;

@ManagedBean
public abstract class SaveCommand
{
  protected SaveInvoker invoker;
  
  public SaveInvoker getInvoker()
  {
    return invoker;
  }

  public void setInvoker(SaveInvoker invoker)
  {
    this.invoker = invoker;
  }

  public abstract void save();
}
