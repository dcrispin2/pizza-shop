package edu.iu.dcrispin.pizzashop.repository;

import edu.iu.dcrispin.pizzashop.model.OrderData;

public interface PizzaRepository {
    String prepareTheOrder(OrderData orderData);
}
