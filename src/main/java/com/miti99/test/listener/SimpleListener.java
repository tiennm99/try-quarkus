package com.miti99.test.listener;

import com.miti99.test.event.SimpleEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class SimpleListener {

  public void onEvent(@Observes SimpleEvent event) {
    System.out.println("SimpleListener.onEvent");
  }
}
