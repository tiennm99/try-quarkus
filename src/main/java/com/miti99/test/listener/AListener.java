package com.miti99.test.listener;

import com.miti99.test.event.GenericEvent;
import com.miti99.test.type.A;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class AListener {

  public void onGenericEvent(@Observes GenericEvent<A> event) {
    System.out.println("AListener.onGenericEvent: " + event.data().getClass());
  }
}
