package org.kteam.dao.form;

import org.kteam.entity.Appointment;


public class AppointmentForm extends Appointment {
  private String holdDay;

  public String getHoldDay() {
    return holdDay;
  }

  public void setHoldDay(String holdDay) {
    this.holdDay = holdDay;
  }

  @Override
  public String toString() {
    return "AppointmentForm{" +
        "holdDay='" + holdDay + '\'' +
        '}';
  }
}
