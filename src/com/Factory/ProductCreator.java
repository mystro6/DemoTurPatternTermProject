package com.Factory;

import javax.faces.bean.ManagedBean;

@ManagedBean
public interface ProductCreator
{
  public Product createProduct();
}
