package com.interview.api.base;

/** Defines the standard lifecycle for every API automation helper. */
public interface ServiceHelper {
    ServiceHelper init();
    ServiceHelper process();
    ServiceHelper validate();
    ServiceHelper test();
}
