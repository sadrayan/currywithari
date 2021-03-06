package com.main.controller;

import com.main.model.Customer;
import com.main.model.dto.DinerDto;
import com.main.model.dto.MealDayDto;
import com.main.service.CustomerService;
import com.main.service.MealService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

/**
 * sadra
 * Created by sadra on 12/10/14.
 */
@Controller
public class MealController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private MealService mealService;

    static Logger log = Logger.getLogger(MealController.class);

    @Transactional
    @RequestMapping(value = "api/dinerMeal/{id}", method = RequestMethod.POST)
    public @ResponseBody
    boolean saveDinerMeal (@RequestBody DinerDto dinerDto) throws Exception {

        Customer customer = customerService.getCustomerById(dinerDto.getId());

        if (customer == null){
            return false;
        } else {
            log.info("Controller meal:::::::" + customer);
            List <MealDayDto> mealDayDtoList = dinerDto.getDinerSchedule();
            log.info("Controller meal:::::::" + mealDayDtoList);

            mealService.saveMeals(customer, mealDayDtoList);

            return true;
        }

    }

    //todo: Handle exception

}
