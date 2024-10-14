package com.miti99.test.listener;

import com.miti99.test.event.GenericEvent;
import com.miti99.test.type.A;
import com.miti99.test.type.B;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class BListener {

  public void onGenericEvent(@Observes GenericEvent<B> event) {
    System.out.println("BListener.onGenericEvent: " + event.data().getClass());
  }
}
