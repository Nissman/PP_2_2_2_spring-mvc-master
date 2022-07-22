package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> carList = new ArrayList<>();

    {
        createCarList();
    }

    @Override
    public void createCarList() {
        for (int i = 0; i < 5; i++) {
            carList.add(new Car(i + 1, "car" + (i + 1), 10 + i));
        }
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0 || count > 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
