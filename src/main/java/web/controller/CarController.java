package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String printCount(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("carList", carService.getCarList(count));
        return "cars";
    }
}
