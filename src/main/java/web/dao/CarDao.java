package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    void createCarList();

    List<Car> getCarList(int count);
}
