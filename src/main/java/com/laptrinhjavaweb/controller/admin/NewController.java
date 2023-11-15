package com.laptrinhjavaweb.controller.admin;


import com.laptrinhjavaweb.service.INewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.NewsDTO;

@Controller(value = "NewControllerOfAdmin")
public class NewController {

    @Autowired
    private INewService newService;

    @RequestMapping(value = "/admin-home/news", method = RequestMethod.GET)
    public ModelAndView ShowListNews(@ModelAttribute("model") NewsDTO model) { // Lưu ý: model trong @ModelAttribute là tên biến tham chiếu đến model ở view
                                                                                    // Còn model ở newsModel là giá trị value của model để truyền vào key("model")
        ModelAndView mav = new ModelAndView("admin/new/NewList");

        model.setListResult(newService.listNew());

        mav.addObject("model", model); // SetAttribute đưa giá trị model với key("model") trả về view

        return mav;
    }

    @RequestMapping(value = "/admin-home/edit", method = RequestMethod.GET)
    public ModelAndView EditNews() {
        ModelAndView mav = new ModelAndView("admin/new/edit");
        return mav;
    }
}
